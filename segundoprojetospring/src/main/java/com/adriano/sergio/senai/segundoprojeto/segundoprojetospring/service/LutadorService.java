package com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.service;

import com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.model.Categoria;
import com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.model.Lutador;
import com.adriano.sergio.senai.segundoprojeto.segundoprojetospring.repositorie.LutadorRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class LutadorService {

    @Autowired
    private LutadorRepositorie lutadorRepository;

    //MÉTODO PARA LISTAR TODOS OS LUTADORES
    public List<Lutador> listarLutadores(){ //LISTA DE VALORES DA ENTIDADE "LUTADORES";
        List<Lutador> lutador = lutadorRepository.findAll(); //ENCONTRO TODOS OS LUTADORES DO LUTADORrEPOSITORIO;
        return lutador; // RETORNO O ATRIBUTO lutador E SEUS VALORES;
    }


    @Transactional //BEAN QUE GARANTE A INTEGRIDADE DOS DADOS. SE FIZER UMA INSERÇÃO INCORRETA, ELE VOLTA O VALOR ANTERIOR;
    public Lutador cadastrarLutador(Lutador lutador){
        Categoria categoria1 = new Categoria(1);
        Categoria categoria2 = new Categoria(2);
        Categoria categoria3 = new Categoria(3);
        if(lutador.getPeso() <= 70){
            lutador.setCategoria(categoria1);
        }else if(lutador.getPeso() >= 80){
            lutador.setCategoria(categoria2);
        }else {
            lutador.setCategoria(categoria3);
        }

       return lutadorRepository.save(lutador);
    }



    //OPTIONAL = fazer o tratamento para quando houverem valores NULL;
    public Optional<Lutador>listarLutador(Integer id){
        return lutadorRepository.findById(id);
    }

    @Transactional
    public void removerLutador(Integer id){
        lutadorRepository.deleteById(id);
    }


}
