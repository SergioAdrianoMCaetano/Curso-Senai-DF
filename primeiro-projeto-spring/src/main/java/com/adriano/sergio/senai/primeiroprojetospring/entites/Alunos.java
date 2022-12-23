package com.adriano.sergio.senai.primeiroprojetospring.entites;

import javax.persistence.*;

@Entity
@Table(name = "TB_ALUNO")
public class Alunos {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "matricula")
    private Integer idAluno;
   @Column(nullable = false, length = 80)
   private String nome;
    @Column
    private String endereco;
    @Column
    private String curso;



//MÉTODOS ESPECIAIS PARA BUSCAR E ALTERAR DADOS;
    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
