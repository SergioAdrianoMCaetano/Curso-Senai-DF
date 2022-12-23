package com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.model;

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
    @Column
    private Integer idade;
    @Column
    private Double altura;




    //CONSTRUTOR DEFAULT
    public Lutador(){

    }


    //BEAN QUE GERA O RELACIONAMENTO ENTRE AS ENTIDADES (LUTADOR E CATEGORIA);
    @ManyToOne
    @JoinColumn(name = "categoria_id") //BEAN QUE DARÁ O NOME A COLUNA RELACIONADA
    private Categoria categoria;




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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
