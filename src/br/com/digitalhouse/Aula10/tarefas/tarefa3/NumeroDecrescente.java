package br.com.digitalhouse.Aula10.tarefas.tarefa3;

public class NumeroDecrescente {
    private int numero;

    public NumeroDecrescente(int numero) {
        this.numero = numero;
    }

    public void printNumeros(){
        System.out.println("--- Impresssão decrescente ---");
        for (int i = this.numero; i > -1; i--) {
            System.out.println(i);
        }
    }
}
