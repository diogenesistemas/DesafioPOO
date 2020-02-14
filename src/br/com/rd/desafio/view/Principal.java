package br.com.rd.desafio.view;


import br.com.rd.desafio.control.DigitalHouseManager;
import br.com.rd.desafio.model.ProfessorAdjunto;
import br.com.rd.desafio.model.ProfessorTitular;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager dh = new DigitalHouseManager();

        dh.registrarProfessorTitular("Fábio", "Araujo", 11001, "Programação");
        dh.registrarProfessorTitular("Claudivan", "Costa", 11002, "Programação");
        dh.registrarProfessorAdjunto("Ricardo", "Marcedo", 22003, 40);
        dh.registrarProfessorAdjunto("Diogo", "Ferreira", 22004, 20);

        dh.registrarCurso("Full Stack", 20001, 3);
        dh.registrarCurso("Android", 20002, 2);

        dh.alocarProfessores(20001, 11001, 22003);
        dh.alocarProfessores(20002, 11002, 22004);

     


    }
}
