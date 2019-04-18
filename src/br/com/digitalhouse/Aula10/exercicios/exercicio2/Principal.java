package br.com.digitalhouse.Aula10.exercicios.exercicio2;

public class Principal {
    public static void main(String[] args) {
        Coca cocaA = new Coca(1,2.2);
        Coca cocaB = new Coca(1,2.5);

        System.out.println(cocaA.equals(cocaB));
    }
}
