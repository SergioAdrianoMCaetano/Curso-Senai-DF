package com.senai.projetowebsenai.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
//ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 150)
    private String nome;

    @Column(length = 150)
    private String email;


    @Column(length = 150)
    private String observacao;
//FIM ATRIBUTOS



    //MÉTODOS ESPECIAIS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //FIM MÉTODOS ESPECIAIS
}
