package br.com.digitalhouse.Aula8.exercicio2;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
public class Principal {
    public static void main(String[] args) {
        Set<Itens> itens = new HashSet<>();

        itens.add(new Itens(1,"Item A",2,2.80));
        itens.add(new Itens(2,"Item B",-1,7.90));
        itens.add(new Itens(3,"Item C",5,20.40));
        itens.add(new Itens(3,"Item D",3,20.40));

        Fatura fatura = new Fatura(itens);
        System.out.println("Total Fatura: "+fatura.getTotalFatura());
    }
}
