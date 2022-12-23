package com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.controller;


import com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.model.Lutador;
import com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.repositorie.LutadorRepositorie;
import com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.service.LutadorService;
import org.apache.catalina.valves.rewrite.ResolverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(value = "/lutador")
public class LutadorController {

    @Autowired
    private LutadorService lutadorService;

    @GetMapping //BEAN PARA PEGAR VALORES
    public ResponseEntity<List<Lutador>> getAllLutador(){
        return ResponseEntity.ok().body(lutadorService.listarLutadores());
    }

    //INSERIR UM NOVO LUTADOR
    @PostMapping
    public ResponseEntity<Object> insertLutador(@RequestBody Lutador lutador){
        return ResponseEntity.status(HttpStatus.CREATED).body(lutadorService.cadastrarLutador(lutador));
    }

    //RECUPERAR UM LUTADOR PELO ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getLutador(@PathVariable(value = "id") Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(lutadorService.listarLutador(id));
    }

    //DELETAR PELO ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteLutador(@PathVariable(value = "id") Integer id){
        lutadorService.removerLutador(id);
        return ResponseEntity.status(HttpStatus.OK).body("Lutador removido da base de dados. ");
    }

    //ATUALZAR PELO ID
    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateLutador(@PathVariable(value = "id") Integer id, @RequestBody Lutador lutador){
        Optional<Lutador> dadosLutador = lutadorService.listarLutador(id);
        Lutador alterarLutador = dadosLutador.get();
        alterarLutador.setNome(lutador.getNome());
        alterarLutador.setIdade(lutador.getIdade());
        alterarLutador.setAltura(lutador.getAltura());
        alterarLutador.setPeso(lutador.getPeso());
        return ResponseEntity.status(HttpStatus.OK).body(lutadorService.cadastrarLutador(alterarLutador));
    }




}
