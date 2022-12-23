package com.adriano.sergio.senai.projetofinal.api.model;


import javax.persistence.*;

@Entity
@Table(name = "indiceremuneracao")
public class IndiceRemuneracao {

    //ATRIBUTOS DA ENTIDADE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String mes;

    @Column
    private String ano;
    @Column
    private double indice;


    //CONSTRUTOR DEFAULT
    public IndiceRemuneracao(){
    }

    //CONSTRUTOR
    public IndiceRemuneracao(Integer id){
        this.id = id;
    }



    //BEAN QUE GERA O RELACIONAMENTO ENTRE AS ENTIDADES (LUTADOR E CATEGORIA);
    @OneToOne
    @JoinColumn(name = "meses_id")
    private Meses meses;



    //MÉTODOS ESPECIAIS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


}
