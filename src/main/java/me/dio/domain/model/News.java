package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// essa classe contem os mesmos atributos da classe feature news, por isso elas estendem da classe abstrata
// BaseItem onde esta mapeada atraves do @MappedSuperclass para as duas classes dessa forma evita que as
// duas classes tenham códigos exatamente iguais.
@Entity(name = "tb_news")
public class News extends BaseItem{

}
