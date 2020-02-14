package br.com.rd.desafio.model;

public class ProfessorTitular extends Professor{
    private String especialidade;

    public ProfessorTitular() {
       super();
    }

    public ProfessorTitular(String nome, String sobrenome, Integer codigo, String especialidade) {
        super(nome, sobrenome, codigo);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}
