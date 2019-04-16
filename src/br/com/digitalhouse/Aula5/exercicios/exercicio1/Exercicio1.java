package br.com.digitalhouse.Aula5.exercicios.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Cliente clienteUm = new Cliente("Jair", "Ribeiro");
        Cliente clienteDois = new Cliente("Angela", "Ribeiro");
        Conta contaClienteUm = new Conta("123456", 1000.99, clienteUm);
        Conta contaClienteDois = new Conta("654321", 2000.50, clienteDois);
        contaClienteUm.deposito(1500.00);
        contaClienteDois.deposito(500.00);
        contaClienteUm.saque(2500.00);
        contaClienteDois.saque(500.00);
    }
}
