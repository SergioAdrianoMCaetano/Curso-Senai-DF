package com.adriano.sergio.senai.projetofinal.api.controller;

import com.adriano.sergio.senai.projetofinal.api.model.IndiceRemuneracao;
import com.adriano.sergio.senai.projetofinal.api.service.IndiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(value = "/indiceremuneracao")
public class IndiceController {

    @Autowired
    private IndiceService indiceService;

    @GetMapping
    public ResponseEntity<List<IndiceRemuneracao>> getAllIndice(){
        return ResponseEntity.ok().body(indiceService.listarindices());
    }

    //INSERIR INDICE
    @PostMapping
    public ResponseEntity<IndiceRemuneracao> insertIndices (@RequestBody IndiceRemuneracao indiceRemuneracao){
        return ResponseEntity.status(HttpStatus.CREATED).body(indiceService.cadastrarIndice(indiceRemuneracao));
    }

    //RECUPERAR INDICE PELO ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getIndice(@PathVariable(value = "id") Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(indiceService.listarindices(id));
    }

    //DELETAR PELO ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteIndice(@PathVariable(value = "id") Integer id){
        indiceService.removerIndice(id);
        return ResponseEntity.status(HttpStatus.OK).body("Índice de Remuneração deletado com sucesso. ");
    }

    //ATUALZAR PELO ID
    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateIndice(@PathVariable(value = "id") Integer id, @RequestBody IndiceRemuneracao lutador){
        Optional<IndiceRemuneracao> dadosIndice = indiceService.listarIndice(id);
        IndiceRemuneracao alterarIndice = dadosIndice.get();
        alterarIndice.setMes(alterarIndice.getMes());
        alterarIndice.setAno(alterarIndice.getAno());
        alterarIndice.setIndice(alterarIndice.getIndice());
        return ResponseEntity.status(HttpStatus.OK).body(indiceService.cadastrarIndice(alterarIndice));
    }



}
