package br.com.digitalhouse.Aula9.pratica;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Jair","Ribeiro",30);
        Pessoa pessoa2 = new Pessoa("Emily","Vitoria",4);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        for (Pessoa pessoa : pessoas){
            System.out.println( "---- Pessoas (List) ---- "+
                                "\nNome: "+pessoa.getNome()+
                                "\nSobrenome: "+pessoa.getSobrenome()+
                                "\nIdade: "+pessoa.getIdade()+
                                "\n");
        }

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(pessoa1);
        pessoaSet.add(pessoa2);
        pessoaSet.add(pessoa1);


        for (Pessoa pessoa : pessoaSet){
            System.out.println( "---- Pessoas (Set) ---- "+
                    "\nNome: "+pessoa.getNome()+
                    "\nSobrenome: "+pessoa.getSobrenome()+
                    "\nIdade: "+pessoa.getIdade()+
                    "\n");
        }

        Map<Integer,Pessoa> integerPessoaMap = new HashMap<>();
        integerPessoaMap.put(0,pessoa1);
        integerPessoaMap.put(2,pessoa2);

        for (Integer chave: integerPessoaMap.keySet()) {
            System.out.println( "---- Pessoas (Map) ---- "+
                    "\nNome: "+integerPessoaMap.get(chave).getNome()+
                    "\nSobrenome: "+integerPessoaMap.get(chave).getSobrenome()+
                    "\nIdade: "+integerPessoaMap.get(chave).getIdade()+
                    "\n");
        }


    }
}
