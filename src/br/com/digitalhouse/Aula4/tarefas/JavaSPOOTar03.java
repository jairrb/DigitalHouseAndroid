package br.com.digitalhouse.Aula4.tarefas;

//Tarefa 3
public class JavaSPOOTar03 {
    public static void main(String[] args) {
        System.out.println(par(2));
    }

    public static boolean par(Integer umNumero) {
        return ((umNumero % 2) == 0);
    }
}
