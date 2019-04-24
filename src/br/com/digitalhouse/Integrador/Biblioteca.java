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
        double preco;

        try {
            Scanner scannerA = new Scanner(System.in);
            System.out.println("Digite o codigo: ");
            codigo = scannerA.next();

            Scanner scannerB = new Scanner(System.in);
            System.out.println("Digite o titulo: ");
            titulo = scannerB.next();

            Scanner scannerC = new Scanner(System.in);
            System.out.println("Digite o Autor: ");
            autor = scannerC.next();

            Scanner scannerD = new Scanner(System.in);
            System.out.println("Digite o ano de lancamento: ");
            lancamento = scannerD.nextInt();

            Scanner scannerE = new Scanner(System.in);
            System.out.println("Digite a quantidade: ");
            qtdestoque = scannerE.nextInt();

            Scanner scannerF = new Scanner(System.in);
            System.out.println("Digite o codigo ISBN: ");
            ISBN = scannerF.next();

            Scanner scannerG = new Scanner(System.in);
            System.out.println("Digite o preco: ");
            preco = scannerG.nextDouble();

            Livro livro = new Livro(codigo, titulo, autor, lancamento, qtdestoque, ISBN, preco);

            if (livros.contains(livro)) {
                System.out.println("Codigo de livro já cadastrado!");
            } else {
                this.livros.add(livro);
            }

        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR");
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

    public int consultarCodigo(String codigo){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;

    }
}
