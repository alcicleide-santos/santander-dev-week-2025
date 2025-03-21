package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String agency;

    //aqui a configuração para o saldo
    //como ficaria 99.999.999.99
    @Column( precision = 13, scale = 2)
    private BigDecimal balance;
    // aqui a configuração para o limite, como a palavra limit muitas vezes é uma
    // palavra reservada da linguagem, podemos costumizar também o nome dela para "additional_limit".
    @Column(name = "additional_limit", scale = 13,precision = 2)
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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Number getBalance() {
        return balance;
    }


    public Number getLimit() {
        return limit;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
