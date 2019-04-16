package br.com.digitalhouse.Aula9.exercicios.exercicio2;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();

        integerList.add(1);
        integerList.add(5);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(8);
        integerList.add(8);

        for (Integer integer : integerList) {
            System.out.print(integer.toString());
        }

        System.out.println("\n");

        integerSet.add(1);
        integerSet.add(5);
        integerSet.add(5);
        integerSet.add(6);
        integerSet.add(7);
        integerSet.add(8);
        integerSet.add(8);
        integerSet.add(8);

        for (Integer integer : integerSet) {
            System.out.print(integer.toString());
        }
    }
}
