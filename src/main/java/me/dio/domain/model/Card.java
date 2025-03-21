package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;

    // aqui a configuração para o limite, como a palavra limit muitas vezes é uma
    // palavra reservada da linguagem, podemos costumizar também o nome dela para "available_limit".
    @Column(name = "available_limit", precision = 13,scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public void setNumber(String number) {
        this.number = number;

    }
}
