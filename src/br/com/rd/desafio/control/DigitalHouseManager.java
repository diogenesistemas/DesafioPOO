package br.com.rd.desafio.control;

import br.com.rd.desafio.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.stream.Collector;


public class DigitalHouseManager {
    private List<Aluno> listaDeAlunos;
    private List<Professor> listaDeProfessores;
    private List<Curso> listaDeCursos;
    private List<Matricula> listaDeMatricula;

    public DigitalHouseManager() {
        init();
    }

    private void init() {
        this.listaDeCursos = new ArrayList<>();
        this.listaDeProfessores = new ArrayList<>();
        this.listaDeAlunos = new ArrayList<>();
        this.listaDeMatricula = new ArrayList<>();
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        this.listaDeCursos.add(curso);
        System.out.println("Registrando Curso Tamanho: " + this.listaDeCursos.size());


    }

    public void excluirCurso(Integer codigoCurso) {
        this.listaDeCursos.removeIf(curso -> (curso.getCodigo() == codigoCurso));
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        this.listaDeProfessores.add(professorAdjunto);
        System.out.println("Registrando Professor Adjunto");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        this.listaDeProfessores.add(professorTitular);
        System.out.println("Registrando Professor Titular");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        this.listaDeProfessores.removeIf(curso -> (curso.getCodigo() == codigoProfessor));
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        this.listaDeAlunos.add(aluno);
    }

    private Curso localizarCurso(Integer codigCurso) {
        for (Curso curso : this.listaDeCursos) {
            if (curso.getCodigo().equals(codigCurso)) {
                return curso;
            }
        }
        return null;
    }

    private Aluno localizarAluno(Integer codigoAluno) {
        for (Aluno aluno : this.listaDeAlunos) {
            if (aluno.getCodigo().equals(codigoAluno)) {
                return aluno;
            }
        }
        return null;
    }


    private Professor localizarProfessor(Integer codigoProfessor) {
        for (Professor professor : this.listaDeProfessores) {
            if (professor.getCodigo().equals(codigoProfessor)) {
                return professor;
            }
        }
        return null;
    }


    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

//        Localizando Aluno e Curso
//        Curso cursoProcurado = this.listaDeCursos.stream().filter(curso -> curso.getCodigo() == codigoCurso);
//        Aluno alunoProcurado = this.listaDeAlunos.stream().filter(aluno -> (aluno.getCodigo() == codigoAluno);

        Curso cursoProcurado = localizarCurso(codigoCurso);
        Aluno alunoProcurado = localizarAluno(codigoAluno);


        //Verificando se o Anulo e o Curso foi encontrado
        if (alunoProcurado != null && cursoProcurado != null) {

            //Tentando Matricular Aluno no Curso, desde que hajam vagas
            if (cursoProcurado.adicionarUmAluno(alunoProcurado)) {
                Matricula matricula = new Matricula(alunoProcurado, cursoProcurado);
                this.listaDeMatricula.add(matricula);
                System.out.println("Matrícula realizada com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a matrícula pois não há vagas");
            }
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        Professor professorTitularProcurado = localizarProfessor(codigoProfessorTitular);
        Professor professorAdjuntoProcurado = localizarProfessor(codigoProfessorAdjunto);
        Curso cursoProcurado = localizarCurso(codigoCurso);


        if (professorTitularProcurado != null && professorAdjuntoProcurado != null && cursoProcurado != null) {
            cursoProcurado.setProfessorAdjunto((ProfessorAdjunto) professorAdjuntoProcurado);
            cursoProcurado.setProfessorTitular((ProfessorTitular) professorTitularProcurado);

        }
    }


}
