package br.com.rd.desafio.model;

import java.util.Objects;

public abstract class Professor {
    private String nome;
    private String sobrenome;
    private Integer codigo;

    public Professor(){}

    public Professor(String nome, String sobrenome, Integer codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigo.equals(professor.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
