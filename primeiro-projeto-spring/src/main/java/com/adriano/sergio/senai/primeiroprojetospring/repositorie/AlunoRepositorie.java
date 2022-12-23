package com.adriano.sergio.senai.primeiroprojetospring.repositorie;

import com.adriano.sergio.senai.primeiroprojetospring.entites.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorie extends JpaRepository<Alunos, Integer> {

}
