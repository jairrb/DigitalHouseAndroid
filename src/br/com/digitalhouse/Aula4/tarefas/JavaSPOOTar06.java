package br.com.digitalhouse.Aula4.tarefas;;

import java.util.ArrayList;
//Tarefa 6
public class JavaSPOOTar06 {
    public static void main(String[] args) {
        System.out.println(listaDePrimeirosCemPositivos());
    }
    public static ArrayList<Integer> listaDePrimeirosCemPositivos() {
        ArrayList<Integer> arrayRet = new ArrayList<Integer>();
        for (int i=1;i<=100;i++){
            arrayRet.add(i);
        }
        return arrayRet;
    }
}
