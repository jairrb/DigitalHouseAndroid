package br.com.digitalhouse.Aula10.tarefas.tarefa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        String nome;
        int idade;

        for (int i = 1; i <= 3; i++){
            Scanner scannerA = new Scanner(System.in);
            System.out.println("Digite o "+i+"º nome: ");
            nome = scannerA.next();

            Scanner scannerB = new Scanner(System.in);
            System.out.println("Digite a "+i+"ª idade: ");
            idade = scannerB.nextInt();

            pessoas.add(new Pessoa(nome,idade));
        }

        System.out.println( "Pessoa mais velha: "+maisVelha(pessoas)+
                            "\nPessoa mais nova: "+maisNova(pessoas));
    }

    public static  String maisVelha(List<Pessoa> pessoas){
        String nomePessoa = "";
        int aux = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > aux){
                aux = pessoa.getIdade();
                nomePessoa = pessoa.getNome();
            }
        }
        return nomePessoa;
    }


    public static String maisNova(List<Pessoa> pessoas){
        String nomePessoa = "";
        int aux = 999;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < aux){
                aux = pessoa.getIdade();
                nomePessoa = pessoa.getNome();
            }
        }
        return nomePessoa;
    }
}
