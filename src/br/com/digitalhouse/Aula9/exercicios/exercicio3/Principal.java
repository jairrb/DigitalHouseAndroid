package br.com.digitalhouse.Aula9.exercicios.exercicio3;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Prova prova = new Prova();
        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(5);
        inteiros.add(7);
        inteiros.add(8);

        prova.somaTotal(inteiros);
    }
}
