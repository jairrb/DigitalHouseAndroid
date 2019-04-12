package br.com.digitalhouse.Aula4.pratica;

import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] valores = new int[4];
        valores[0] = 2;
        valores[1] = 5;
        valores[2] = 6;
        valores[3] = 3;

        System.out.println(RetPares(valores));

    }
    public static ArrayList<Integer> RetPares(int[] valores){
        ArrayList<Integer> valRet = new ArrayList<Integer>();

        for(int i = 0; i < valores.length; i++){
            if ((valores[i] % 2) == 0) {
                valRet.add(valores[i]);
            }
        }
        return valRet;
    }
}