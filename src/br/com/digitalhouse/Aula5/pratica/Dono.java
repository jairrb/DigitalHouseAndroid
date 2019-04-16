package br.com.digitalhouse;

public class Dono {
    private String nome;
    public String sexo;

    public void alimentar(Cachorro cachorro) {
        System.out.println("Olá " + cachorro.nome + " " + cachorro.raca);
    }

    //contrutor especifico
    public Dono(String nomeDono) {
        this.nome = nomeDono;
    }

    //contrutor padrao
    public Dono() {

    }

    //Get
    public String getNome() {
        return nome;
    }

    //Set
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}