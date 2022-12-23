package com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.model;


//MODELO DE NEGÓCIO - ENTIDADE NO BANCO DE DADOS

import javax.persistence.*;


@Entity
@Table(name = "lutador")
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private Double peso;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //CONSTRUTOR PADRÃO;
    public Lutador(){
    }

    //MÉTODOS ESPECIAIS - OBTER E ALTERAR VALORES;


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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
