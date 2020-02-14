package br.com.rd.desafio.view;


import br.com.rd.desafio.control.DigitalHouseManager;
import br.com.rd.desafio.model.ProfessorAdjunto;
import br.com.rd.desafio.model.ProfessorTitular;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager dh = new DigitalHouseManager();

        dh.registrarProfessorTitular("Fábio", "Araujo", 1, "Programação");
        dh.registrarProfessorTitular("Claudivan", "Costa", 2, "Programação");
        dh.registrarProfessorAdjunto("Ricardo", "Marcedo", 3, 40);
        dh.registrarProfessorAdjunto("Diogo", "Ferreira", 4, 20);

     


    }
}
