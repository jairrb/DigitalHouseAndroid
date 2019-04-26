package br.com.digitalhouse.Integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    List<Colecao> colecao = new ArrayList<>();

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }


    public Biblioteca() {
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);

    }

    public void addColecao(Colecao colecao) {
        this.colecao.add(colecao);
    }

    public void cadastrarLivro() {
        String codigo;
        String titulo;
        String autor;
        int lancamento;
        int qtdestoque;
        String ISBN;
        Double preco;

        System.out.println("---- CADASTRAR LIVRO ----");
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("DIGITE O CODIGO: ");
            codigo = scanner.next();

            System.out.println("DIGITE O TITULO: ");
            titulo = scanner.next();

            System.out.println("DIGITE O AUTOR: ");
            autor = scanner.next();

            System.out.println("DIGITE O ANO DE LANCAMENTO: ");
            lancamento = scanner.nextInt();

            System.out.println("DIGITE A QUANTIDADE: ");
            qtdestoque = scanner.nextInt();

            System.out.println("DIGITE O CODIGO ISBN: ");
            ISBN = scanner.next();

            System.out.println("DIGITE O PRECO: ");
            preco = scanner.nextDouble();

            Livro livro = new Livro(codigo, titulo, autor, lancamento, qtdestoque, ISBN, preco);

            if (livros.contains(livro)) {
                System.out.println("CODIGO DE LIVRO JÁ CADASTRADO!\n");
            } else {
                this.livros.add(livro);
                System.out.println("NOVO LIVRO CADASTRADO!\n");
                System.out.println(livro.toString());
            }

        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR" + e.getMessage());
        }

    }

    public void consultar(int opcao) {
        String codigo;
        Scanner scanner = new Scanner(System.in);

        if (opcao == 1) {
            System.out.println("---- CONSULTAR LIVRO ----");
        }else{
            System.out.println("---- CONSULTAR COLECAO ----");
        }

        System.out.println("DIGITE O CODIGO: ");
        codigo = scanner.next();

        int posicao = consultarCodigo(codigo,opcao);

        if (posicao != -1) {
            if (opcao == 1) {
                System.out.println("--- LIVRO ---");
                System.out.println(livros.get(posicao).toString());
            }else{
                System.out.println("--- COLECAO ---");
                System.out.println(colecao.get(posicao).toString());
            }
        } else {
            System.out.println("LIVRO NÃO ENCONTRADO! \n");
        }
    }

    public void vender(int opcao) {
        String codigo;
        Scanner scannerA = new Scanner(System.in);

        if (opcao == 1) {
            System.out.println("---- VENDA LIVRO ----");
        }else{
            System.out.println("---- VENDA COLECAO ----");
        }

        System.out.println("DIGITE O CODIGO: ");
        codigo = scannerA.next();

        int pos = consultarCodigo(codigo,opcao);

        if (pos != -1) {
            int quantidade;
            Scanner scannerB = new Scanner(System.in);
            System.out.println("DIGITE A QUANTIDADE: ");
            quantidade = scannerB.nextInt();

            if (opcao == 1) {
                livros.get(pos).baixaLivro(quantidade);
            }else{
                colecao.get(pos).baixaColecao(quantidade);
            }
        }
    }

    public int consultarCodigo(String codigo,int opcao) {
        if (opcao == 1) {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getCodigo().equals(codigo)) {
                    return i;
                }
            }
        }else{
            for (int i = 0; i < colecao.size(); i++) {
                if (colecao.get(i).getCodigo().equals(codigo)) {
                    return i;
                }
            }
        }

        if (opcao == 1) {
            System.out.println("LIVRO NÃO ENCONTRADO! \n");
        }else{
            System.out.println("COLECAO NÃO ENCONTRADO! \n");
        }
            return -1;
    }
}