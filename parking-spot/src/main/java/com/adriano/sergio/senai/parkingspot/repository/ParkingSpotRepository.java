package com.adriano.sergio.senai.parkingspot.repository;

import com.adriano.sergio.senai.parkingspot.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository <ParkingSpotModel, Integer>{


    //PARA SABER SE A PLACA EXISTE OU NÃO;
    //INTERFACE NÃO PODE CONTER CORPO DE MÉTODO, APENAS A ASSINATURA;
    public boolean existsByPlacaCarro(String placa);
    public boolean existsByVaga(String vaga);

}
