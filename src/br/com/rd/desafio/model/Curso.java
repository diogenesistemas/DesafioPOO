package br.com.rd.desafio.model;

import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigo;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer qtdMaxAlunos;
    private List<Aluno> listaAlunosMatriculados;

    public Curso(){}

    public Curso(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigo.equals(curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
