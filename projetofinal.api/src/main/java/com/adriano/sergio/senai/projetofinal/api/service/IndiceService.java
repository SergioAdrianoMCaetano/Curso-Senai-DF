package com.adriano.sergio.senai.projetofinal.api.service;

import com.adriano.sergio.senai.projetofinal.api.model.IndiceRemuneracao;
import com.adriano.sergio.senai.projetofinal.api.repository.IndiceReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class IndiceService {

    @Autowired
    private IndiceReposiroty indiceReposiroty;

     //MÉTODO PARA LISTAR OS ÍNDICES
    public List<IndiceRemuneracao> listarindices(){
        List<IndiceRemuneracao> indiceRemuneracaos = indiceReposiroty.findAll();
        return indiceRemuneracaos;
    }


    @Transactional //BEAN QUE GARANTE A INTEGRIDADE DOS DADOS. SE FIZER UMA INSERÇÃO INCORRETA, ELE VOLTA O VALOR ANTERIOR;
    public IndiceRemuneracao cadastrarIndice(IndiceRemuneracao indiceRemuneracao){
        return indiceReposiroty.save(indiceRemuneracao);
    }

    //OPTIONAL = fazer o tratamento para quando houverem valores NULL;
    public Optional<IndiceRemuneracao> listarIndice(Integer id){
        return indiceReposiroty.findById(id);
    }

    @Transactional
    public void removerIndice(Integer id){
        indiceReposiroty.deleteById(id);
    }


    public Object listarindices(Integer id) {
        return null;
    }
}
