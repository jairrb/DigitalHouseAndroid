package br.com.digitalhouse.Integrador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro("A0001","JAVA PARA INICIANTES","JESSICA",2017,2,"999999999-9", 24.99);
        Livro livro2 = new Livro("A0002","ANDROID PARA INICIANTES","TAIRO",2016,5,"888888888-8", 24.99);

        Colecao colecao = new Colecao("C0001",40.0,"MOBILE ANDROID");
        colecao.addLivro(livro1);
        colecao.addLivro(livro2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addColecao(colecao);

        Scanner in = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("SELECIONE UMA OPERACAO");
            System.out.println("1 - CADASTRAR LIVRO");
            System.out.println("2 - CONSULTAR LIVRO");
            System.out.println("3 - VENDA LIVRO");
            System.out.println("4 - CONSULTAR COLECAO");
            System.out.println("5 - VENDA COLECAO");
            System.out.println("6 - SAIR");
            try {
                opcao = Integer.parseInt(in.nextLine());
                if (opcao > 0 && opcao < 6) {
                    processar(opcao,biblioteca);

                } else if (opcao > 6) {
                    System.out.println("OPÇÃO INVÁLIDA!");
                    opcao = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("OPÇÃO INVÁLIDA!");
                opcao = -1;
            }
        }

    }

    public static void processar(int opcaoSelecionada,Biblioteca biblioteca){
        System.out.println(opcaoSelecionada);

        switch (opcaoSelecionada) {
            case 1:
                biblioteca.cadastrarLivro();
                break;
            case 2:
                biblioteca.consultar(1);
                break;
            case 3:
                biblioteca.vender(1);
                break;
            case 4:
                biblioteca.consultar(2);
                break;
            case 5:
                biblioteca.vender(2);
                break;
        }
    }
}