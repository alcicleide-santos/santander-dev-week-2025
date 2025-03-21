package me.dio.domain.model;
import jakarta.persistence.*;

import java.util.List;
// coloca se a anotação para transfromar cada entidade em uma tabela no banco de dados, e você pode costumizar o nome de sua tabela

@Entity
@Table(name="tb_users")
public class User {
    // aqui especifique que o id é um identificador de fato
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // caso você queira colocar um tamano para o nome voce pode usar o @Column
    private String name;

    // aqui temos um usuario que tem um relacionamento de um para um, usa- se o cascade para que quando um
    // usuario for deletado a sua conta seja deletada junto
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    //aqui o relacionamento é um para muitos, a FetchType.EAGER, significa que toda vez que se for buscar um usuario
    //no banco sempre vai trazer a lista de Fetch do usuario
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Feature> features;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<News> news;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeature() {
        return features;
    }

    public void setFeature(List<Feature> feature) {
        this.features = feature;
    }

    public List<News> getNews() {
        return news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNews(List<News> news) {
        this.news = news;


    }
}
