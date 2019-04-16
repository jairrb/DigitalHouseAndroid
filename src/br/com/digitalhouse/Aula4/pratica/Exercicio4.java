package br.com.digitalhouse.Aula4.pratica;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println(SomaArray());

    }

    public static int SomaArray() {
        int numAux = 10;
        int somaNum = 0;
        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numAux;
            numAux += 10;
        }

        for (int i = 0; i < numeros.length; i++) {
            somaNum += numeros[i];
        }

        return somaNum;

    }
}
