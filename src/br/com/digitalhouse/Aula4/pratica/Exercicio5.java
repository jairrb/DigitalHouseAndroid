package br.com.digitalhouse.Aula4.pratica;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] valores = new int[4];
        valores[0] = 2;
        valores[1] = 5;
        valores[2] = 6;
        valores[3] = 3;

        System.out.println(SomaPares(valores));

    }
    public static int SomaPares(int[] valores){
        int valRet = 0;

        for(int i = 0; i < valores.length; i++){
            if ((valores[i] % 2) == 0) {
                valRet += valores[i];
            }
        }


        return  valRet;

    }
}
