package com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.service;

import com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.model.Categoria;
import com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.model.Lutador;
import com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.repertorie.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//É ONDE SÃO PROGRAMADAS AS REGRAS DE NEGÓCIO;
@Service
public class LutadorService {

    @Autowired //UTILIZO TUDO QUE TEM NA CLASSE ESPECIFICADA;
    private LutadorRepository lutadorRepository;

    public List<Lutador> listarLutadores(){
        List<Lutador> lutadores = lutadorRepository.findAll();
        return lutadores;
    }


}
