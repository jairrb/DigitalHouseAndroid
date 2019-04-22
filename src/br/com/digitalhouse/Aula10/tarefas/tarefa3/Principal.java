package br.com.digitalhouse.Aula10.tarefas.tarefa3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();

        NumeroDecrescente numeroDecrescente = new NumeroDecrescente(numero);
        numeroDecrescente.printNumeros();
    }
}
