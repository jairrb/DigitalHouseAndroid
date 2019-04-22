package br.com.digitalhouse.Aula10.exercicios.exercicio4;

public class Funcionario {
    private String nome;
    private int numeroDeRegistro;

    public Funcionario(String nome, int numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return numeroDeRegistro == that.numeroDeRegistro;
    }
}
