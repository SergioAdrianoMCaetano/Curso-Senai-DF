package com.adriano.sergio.senai.parkingspot.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID; //ESSE FORMATO DE ID GERA UM "CÓDIGO DE BARRAS" NO VALOR;

@Entity
@Table(name = "parking_spot")
public class ParkingSpotModel {

    //MODELO DE ENTIDADE;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String representante;

    @Column(nullable = false, length = 40)
    private String marcaCarro;

    @Column(nullable = false, length = 40)
    private String modeloCarro;

    @Column(nullable = false, length = 7)
    private String placaCarro;

    @Column(nullable = false, length = 10)
    private String vagas;

    private LocalDateTime data;


//MÉTODOS ESPECIAIS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
