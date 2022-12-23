package com.adriano.sergio.senai.primeiroprojetospring.controllers;

import com.adriano.sergio.senai.primeiroprojetospring.entites.Alunos;
import com.adriano.sergio.senai.primeiroprojetospring.repositorie.AlunoRepositorie;
import com.adriano.sergio.senai.primeiroprojetospring.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//AO SER INICIADO, O SPRING IRÁ PROCURAR O CONTROLLER. RESTCONTROLLER É O BEAN QUE EXECUTA ESSA FUNÇÃO;
@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService aluno;

    @GetMapping
    public ResponseEntity<List<Alunos>> getAllAlunos(){
        return ResponseEntity.ok().body(aluno.findAll());
    }


}

