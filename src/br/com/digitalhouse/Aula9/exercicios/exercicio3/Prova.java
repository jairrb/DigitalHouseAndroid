package br.com.digitalhouse.Aula9.exercicios.exercicio3;
import java.util.*;
public class Prova {
    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        int somaTotal = 0;
        for (Integer conjuntoDeInteiro : conjuntoDeInteiros) {
            somaTotal += conjuntoDeInteiro;
        }
        System.out.println("Total: "+somaTotal);
    }
}
