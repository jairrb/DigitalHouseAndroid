package br.com.digitalhouse.Aula4.tarefas;
//Tarefa 1
public class JavaSPOOTar01 {
    public static void main(String[] args) {
        System.out.println(maiorDeTresNumeros(4,7,2));
    }
    public static int maiorDeTresNumeros(Integer umNumeroA,Integer umNumeroB,Integer umNumeroC) {
        return Math.max(Math.max(umNumeroA, umNumeroB), umNumeroC);
    }
}
