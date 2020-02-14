package br.com.rd.desafio.control;

import br.com.rd.desafio.model.*;

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
       this.listaDeProfessores = new ArrayList<>();
       this.listaDeAlunos = new ArrayList<>();
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        this.listaDeCursos.add(curso);
    }

    public void excluirCurso(Integer codigoCurso){
        this.listaDeCursos.removeIf(curso -> (curso.getCodigo() == codigoCurso));
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        this.listaDeProfessores.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        this.listaDeProfessores.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor){
        this.listaDeProfessores.removeIf(curso -> (curso.getCodigo() == codigoProfessor));
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        this.listaDeAlunos.add(aluno);
    }






}
