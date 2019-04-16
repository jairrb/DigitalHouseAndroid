package br.com.digitalhouse.Aula4.tarefas;

import java.util.ArrayList;

//Tarefa 7
public class JavaSPOOTar07 {
    public static void main(String[] args) {
        System.out.println(listaDeNumerosEntre(1, 5));
    }

    public static ArrayList<Integer> listaDeNumerosEntre(Integer minimo, Integer maximo) {
        ArrayList<Integer> arrayRet = new ArrayList<Integer>();
        for (int i = minimo + 1; i < maximo; i++) {
            arrayRet.add(i);
        }
        return arrayRet;
    }
}
