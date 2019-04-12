package br.com.digitalhouse.Aula5.exercicios.exercicio3;

public class Atleta {
    private String nome;
    private int nivel;
    private int energia;

    public Atleta (String nomeAtleta, int nivelAtleta, int energiaAtleta){
        this.nome = nomeAtleta;
        this.nivel = nivelAtleta;
        this.energia = energiaAtleta;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public String getNome() {
        return nome;
    }
}
