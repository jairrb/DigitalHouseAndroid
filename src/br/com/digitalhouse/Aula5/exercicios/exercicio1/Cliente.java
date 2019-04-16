package br.com.digitalhouse.Aula5.exercicios.exercicio1;

public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente(String nomeCliente, String sobrenomeCliente) {
        this.nome = nomeCliente;
        this.sobrenome = sobrenomeCliente;
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
}
