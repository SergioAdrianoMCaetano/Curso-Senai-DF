package com.adriano.sergio.senai.projetofinal.api.model;

import javax.persistence.*;

@Entity
@Table(name = "meses")
public class Meses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String meses;


    //CONSTRUTOR DEFAULT
    public Meses(){
    }

    //CONSTRUTOR
    public Meses(Integer id){
        this.id = id;
    }

    //BEAN QUE GERA O RELACIONAMENTO ENTRE AS ENTIDADES (LUTADOR E CATEGORIA);
    @OneToOne
    @JoinColumn(name = "indiceremuneracao_id")
    private IndiceRemuneracao indiceRemuneracao;



    //MÉTODOSESPECIAIS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }
}
