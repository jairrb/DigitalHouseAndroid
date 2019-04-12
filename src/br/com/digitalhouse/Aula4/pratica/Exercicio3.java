package br.com.digitalhouse.Aula4.pratica;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Integer umNumeroA;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        umNumeroA = scanner.nextInt();
        System.out.println(VerificaImpar(umNumeroA));

    }

    public static boolean VerificaImpar(Integer a){
        return (a % 2) == 1 && a > 10;
    }
}
