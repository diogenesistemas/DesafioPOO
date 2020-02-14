package br.com.rd.desafio.model;

public class ProfessorAdjunto extends Professor{
    private Integer quantidadeHoras;

    public ProfessorAdjunto() {
       super();
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer codigo, Integer quantidadeHoras) {
        super(nome, sobrenome, codigo);
        this.quantidadeHoras = quantidadeHoras;
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
