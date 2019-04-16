package br.com.digitalhouse.Aula5.exercicios.exercicio3;

import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Bolt", 8, 9);
        Atleta atleta2 = new Atleta("Tyson Gay", 9, 8);
        Prova prova1 = new Prova(6, 9);
        Prova prova2 = new Prova(7, 8);
        Prova prova3 = new Prova(9, 7);
        Estadio estadio1 = new Estadio();
        ArrayList<Prova> provas = new ArrayList<Prova>();

        //atletaUM
        System.out.println("Atleta: " + atleta1.getNome());
        System.out.println("Realizou prova 1?  " + prova1.podeRealizar(atleta1));
        System.out.println("Realizou prova 2?  " + prova2.podeRealizar(atleta1));
        System.out.println("Realizou prova 3?  " + prova3.podeRealizar(atleta1));

        //atletaDois
        System.out.println("Atleta: " + atleta2.getNome());
        System.out.println("Realizou prova 1?  " + prova1.podeRealizar(atleta2));
        System.out.println("Realizou prova 2?  " + prova2.podeRealizar(atleta2));
        System.out.println("Realizou prova 3?  " + prova3.podeRealizar(atleta2));

        //Exercicio adicional
        //Melhor na prova
        prova1.melhorNaProva(atleta1, atleta2);
        prova2.melhorNaProva(atleta1, atleta2);
        prova3.melhorNaProva(atleta1, atleta2);

        //Desempenho
        provas.add(prova1);
        provas.add(prova2);
        estadio1.setNomeEstadio("Azteca");
        estadio1.setProvas(provas);
        estadio1.desempenho(atleta1);
        estadio1.desempenho(atleta2);

        //Medalha de Ouro
        estadio1.medalhaDeOuro(atleta1, atleta2);
    }
}