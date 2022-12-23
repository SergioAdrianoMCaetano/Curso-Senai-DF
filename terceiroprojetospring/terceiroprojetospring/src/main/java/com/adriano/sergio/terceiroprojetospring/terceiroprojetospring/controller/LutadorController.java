package com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.controller;

import com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.service.LutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lutador")
public class LutadorController {

    @Autowired //DEPENDENTE DO QUE ACONTECE NA CLASSE SERVICE
    private LutadorService lutadorService;
    @GetMapping //DO CAMINHO '/LUTADOR', OBTENDO OS VALORES REQUERIDOS POR MEIO DO MAPEAMENTO;
    public ResponseEntity<Object> getAllLutador(){
        return ResponseEntity.status(HttpStatus.OK).body(lutadorService.listarLutadores());
    }


}
