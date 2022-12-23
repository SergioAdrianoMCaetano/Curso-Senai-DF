package com.adriano.sergio.senai.primeiroprojetospring.service;

import com.adriano.sergio.senai.primeiroprojetospring.entites.Alunos;
import com.adriano.sergio.senai.primeiroprojetospring.repositorie.AlunoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepositorie aluno;

    @GetMapping
    public List<Alunos> findAll(){
        List<Alunos> lista = aluno.findAll();
        return lista;
    }
}
