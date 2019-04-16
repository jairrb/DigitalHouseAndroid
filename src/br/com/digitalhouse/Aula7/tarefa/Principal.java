package br.com.digitalhouse.Aula7.tarefa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("Selecione uma operacao");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Sair");
            try {
                opcao = Integer.parseInt(in.nextLine());
                if (opcao > 0 && opcao < 5) {
                    processar(opcao);

                } else if (opcao > 5) {
                    System.out.println("Opção inválida!");
                    opcao = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
                opcao = -1;
            }
        }

    }

    public static void processar(int opcaoSelecionada) {
        switch (opcaoSelecionada) {
            case 1:
                System.out.println("---- Operacao Soma ----");
                break;
            case 2:
                System.out.println("---- Operacao Subtracao ----");
                break;
            case 3:
                System.out.println("---- Operacao Multiplicacao ----");
                break;
            case 4:
                System.out.println("---- Operacao Divisao ----");
                break;
        }

        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);

        int a = 0;
        int b = 0;

        try {
            System.out.println("Digite o primeiro numero: ");
            a = Integer.parseInt(scannerA.nextLine());//scannerA.nextInt();

            System.out.println("Digite o segundo numero: ");
            b = Integer.parseInt(scannerB.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Valor Digitado Invalido!");
            System.exit(1);
        }

        switch (opcaoSelecionada) {
            case 1:
                Soma soma = new Soma();
                System.out.println("Resultado da soma: " + soma.Calcula(a, b));
                break;
            case 2:
                Subtracao subtracao = new Subtracao();
                System.out.println("Resultado da subtracao: " + subtracao.Calcula(a, b));
                break;
            case 3:
                Multiplicacao multiplica = new Multiplicacao();
                System.out.println("Resultado da multiplicacao: " + multiplica.Calcula(a, b));
                break;
            case 4:
                Divisao divisao = new Divisao();
                System.out.println("Resultado da divisao: " + divisao.Calcula(a, b));
                break;
        }
        System.exit(0);
    }
}