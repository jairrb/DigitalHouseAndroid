package br.com.digitalhouse.Aula10.exercicios.exercicio1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoaA = new Pessoa("Pessoa A",123456789);
        Pessoa pessoaB = new Pessoa("Pessoa B",123456789);

        System.out.println(pessoaA.equals(pessoaB));
    }
}
