package br.com.digitalhouse.Aula6.tarefa2;

import java.util.Scanner;

public class ComprarIngresso {
    public static void main(String[] args) {
        int tipoIngresso;
        int tipoCamarote;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo ingresso (digitar 1 para normal e 2 para VIP) ");
        tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {
            Normal ingresso = new Normal();
            ingresso.imprimeNormal();
            ingresso.imprimeValor();

        } else if (tipoIngresso == 2) {
            System.out.println("Tipo camarote (digitar 1 para camarote superior e 2 para camarote inferiror) ");
            tipoCamarote = scanner.nextInt();

            if (tipoCamarote == 1) {
                CamaroteSuperior ingresso = new CamaroteSuperior();
                ingresso.valorSup();
                ingresso.imprimeValor();

            } else if (tipoCamarote == 2) {
                CamaroteInferior ingresso = new CamaroteInferior();
                System.out.println("Localizacao inferior: " + ingresso.getLocalizacao());
                ingresso.imprimeValor();
            } else {
                System.out.println("Tipo camarote invalido!");
            }
        } else {
            System.out.println("Tipo ingresso invalido!");
        }
    }
}