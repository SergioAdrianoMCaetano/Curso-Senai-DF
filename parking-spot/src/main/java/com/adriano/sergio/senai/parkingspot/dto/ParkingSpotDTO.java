package com.adriano.sergio.senai.parkingspot.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class ParkingSpotDTO {

    @NotBlank //GARANTE QUE O CAMPO NÃO VIRÁ VAZIO
    private String representante;

    @NotBlank
    private String marcaCarro;

    @NotBlank
    private String modeloCarro;

    @NotBlank
    private String placaCarro;

    @NotBlank
    private String vagas;



    //MÉTODOS ESPECIAIS
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
}
