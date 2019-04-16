package br.com.digitalhouse.Aula4.pratica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0D;
        umaCadeiaDeTexto = "Cadeia de texto do JRibeiro";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);
        System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("Diferença entre A e B = " + Math.abs(umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        umNumeroA = scanner.nextInt();
        System.out.println("Recebi: " + umNumeroA);
    }
}
