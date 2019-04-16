package br.com.digitalhouse.Aula4.pratica;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer umNumeroA;
        Integer umNumeroB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        umNumeroA = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        umNumeroB = scanner.nextInt();

        System.out.println(VerificaMenor(umNumeroA, umNumeroB));

    }

    public static boolean VerificaMenor(Integer a, Integer b) {
        return (a < b);
    }
}
