package com.adriano.sergio.senai.parkingspot.service;

import com.adriano.sergio.senai.parkingspot.model.ParkingSpotModel;
import com.adriano.sergio.senai.parkingspot.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpotService {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    //LISTAR O CONTEÚDO INSERIDO NO REPOSITÓRIO;
    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();
    }

    //CADASTRAR/SALVAR UMA VAGA e UMA PLACA;
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }

    //SE A VAGA ESTÁ OCUPADA;
    public boolean existsByVaga(String vaga){
        return parkingSpotRepository.existsByVaga(vaga);
    }

    //SE A PLACA DO CARRO É REPETIDA;
    public boolean existsPlacaCarro(String placa){
        return parkingSpotRepository.existsByPlacaCarro(placa);
    }

}
