package com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.model;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {


    //ATRIBUTOS DA ENTIDADE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;


    //CONSTRUTOR DEFAULT
    public Categoria(){

    }

    public Categoria(Integer id){
        this.id = id;
    }


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
}
