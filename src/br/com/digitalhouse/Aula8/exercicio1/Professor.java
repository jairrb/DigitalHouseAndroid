package br.com.digitalhouse.Aula8.exercicio1;

public class Professor implements Docente {
    private int rd;
    private String nome;

    public Professor(int rd, String nome) {
        this.rd = rd;
        this.nome = nome;
    }

    public Professor() {
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void darAulas() {
        System.out.println("Professor " + this.nome + " dando aula..." );

    }

    @Override
    public void fazerChamada() {
        System.out.println("Professor " + this.nome + " fazendo chamada..." );
    }
}
