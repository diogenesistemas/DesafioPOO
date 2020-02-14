package br.com.rd.desafio.control;

import br.com.rd.desafio.model.Aluno;
import br.com.rd.desafio.model.Curso;
import br.com.rd.desafio.model.Matricula;
import br.com.rd.desafio.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> listaDeAlunos;
    List<Professor> listaDeProfessores;
    List<Curso> listaDeCursos;
    List<Matricula> listaDeMatricula;

    public DigitalHouseManager(){
        init();
    }

    private void init(){
       this.listaDeCursos = new ArrayList<>();
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
    }

    public void excluirCurso(Integer codigoCurso){
        this.listaDeCursos.removeIf(curso -> (curso.getCodigo() == codigoCurso));
    }





}
