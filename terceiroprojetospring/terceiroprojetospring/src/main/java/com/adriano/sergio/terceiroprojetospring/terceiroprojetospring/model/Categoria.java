package com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.model;

//MODELO DE NEGÓCIO - ENTIDADE NO BANCO DE DADOS

import javax.persistence.*;


@Entity
@Table(name = "categoria")
public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;

//CONSTRUTOR PADRÃO NO MODO JAVA
    public Categoria(){

    }




//MÉTODOS ESPECIAIS - OBTEM E ALTERA VALORES;
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
}
