package com.adriano.sergio.senai.parkingspot.controller;

import com.adriano.sergio.senai.parkingspot.dto.ParkingSpotDTO;
import com.adriano.sergio.senai.parkingspot.model.ParkingSpotModel;
import com.adriano.sergio.senai.parkingspot.service.ParkingSpotService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping(value = "/parking-spot")
public class ParkingSpotController {

    @Autowired
    private ParkingSpotService parkingSpotService;


    //OBTER MAPEAMENTO;
    @GetMapping
    //LISTAR E OBETER DA ENTIDADE VALORES INSERIDOS PELO REPOSITÓRIO;
    public List<ParkingSpotModel> getAllParkingSpot() {
        return parkingSpotService.findAll();
    }

    //INSERIR NA ENTIDADE MAPEADA;
    @PostMapping
                                                                //@VALID É A ANOTAÇÃO QUE IRÁ APLICAR AS DTO's;
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO) {
        if(parkingSpotService.existsByVaga(parkingSpotDTO.getVagas())){
            return  ResponseEntity.status(HttpStatus.CONFLICT).body("Plate car is alredy use!(Placa de carro já em uso)");
        }

        if(parkingSpotService.existsPlacaCarro(parkingSpotDTO.getPlacaCarro())){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot is alredy register(Vaga em uso)");

        }

        var parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDTO, parkingSpotModel);
        parkingSpotModel.setData(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }
}
