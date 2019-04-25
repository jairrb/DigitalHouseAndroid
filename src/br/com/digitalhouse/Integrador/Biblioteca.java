package br.com.digitalhouse.Integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public Biblioteca() {
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);

    }

    public void cadastrarLivro() {
        String codigo;
        String titulo;
        String autor;
        int lancamento;
        int qtdestoque;
        String ISBN;
        Double preco;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o codigo: ");
            codigo = scanner.next();

            System.out.println("Digite o titulo: ");
            titulo = scanner.next();

            System.out.println("Digite o Autor: ");
            autor = scanner.next();

            System.out.println("Digite o ano de lancamento: ");
            lancamento = scanner.nextInt();

            System.out.println("Digite a quantidade: ");
            qtdestoque = scanner.nextInt();

            System.out.println("Digite o codigo ISBN: ");
            ISBN = scanner.next();

            System.out.println("Digite o preco: ");
            preco = scanner.nextDouble();

            Livro livro = new Livro(codigo, titulo, autor, lancamento, qtdestoque, ISBN, preco);

            if (livros.contains(livro)) {
                System.out.println("Codigo de livro já cadastrado!\n");
            } else {
                this.livros.add(livro);
                System.out.println("Livro adicionado!\n");
            }

        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR"+e.getMessage());
        }

    }

    public void consultarLivro() {
        String codigo;
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Digite o codigo: ");
        codigo = scannerA.next();

        int posLivro = consultarCodigo(codigo);

        if (posLivro != -1) {
                System.out.println("--- LIVRO ---");
                System.out.println(livros.get(posLivro).toString());
        }else{
            System.out.println("LIVRO NÃO ENCONTRADO! \n");
        }
    }

    public void venderLivro() {
        String codigo;
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Digite o codigo: ");
        codigo = scannerA.next();

        int posLivro = consultarCodigo(codigo);

        if (posLivro != -1) {
            int quantidade;
            Scanner scannerB = new Scanner(System.in);
            System.out.println("Digite a quantidade: ");
            quantidade = scannerB.nextInt();

            System.out.println("--- VENDA LIVRO ---");
            livros.get(posLivro).baixaQuantidade(quantidade);
        }else{
            System.out.println("LIVRO NÃO ENCONTRADO! \n");
        }
    }

    public int consultarCodigo(String codigo){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;

    }
}
