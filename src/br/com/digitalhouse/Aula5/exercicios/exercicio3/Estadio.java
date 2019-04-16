package br.com.digitalhouse.Aula5.exercicios.exercicio3;

import java.util.ArrayList;

public class Estadio {
    private String nomeEstadio;
    private ArrayList<Prova> provas = new ArrayList<Prova>();

    public void setNomeEstadio(String nomeEstadio) {

        this.nomeEstadio = nomeEstadio;
    }

    public void setProvas(ArrayList<Prova> provas) {

        this.provas = provas;
    }

    public ArrayList<Prova> desempenho(Atleta atleta) {
        ArrayList<Prova> provasRealizadas = new ArrayList<Prova>();
        int provasCompletadas = 0;

        for (int i = 0; i < this.provas.size(); i++) {
            if (provas.get(i).podeRealizar(atleta)) {
                provasRealizadas.add(provas.get(i));
                provasCompletadas++;
            }
        }
        System.out.println("Estadio: " + this.nomeEstadio);
        System.out.println("Atleta: " + atleta.getNome() + " completou " + provasCompletadas + " provas de " + this.provas.size());
        return provasRealizadas;
    }

    public void medalhaDeOuro(Atleta atleta1, Atleta atleta2) {
        int provasAtleta1 = 0;
        int provasAtleta2 = 0;

        for (int i = 0; i < this.provas.size(); i++) {
            if (provas.get(i).podeRealizar(atleta1)) {
                provasAtleta1++;
            }

            if (provas.get(i).podeRealizar(atleta2)) {
                provasAtleta2++;
            }

        }

        if (provasAtleta1 > provasAtleta2) {
            System.out.println("Atleta " + atleta1.getNome() + " medalha de Ouro!");
        } else if (provasAtleta1 < provasAtleta2) {
            System.out.println("Atleta " + atleta2.getNome() + " medalha de Ouro!");
        } else {
            System.out.println("Realizar nova rodada de competição");
        }
    }
}
