package br.com.digitalhouse.Aula10.tarefas.tarefa5;

public class Quadrado extends Quadrilateros {
    private double tamanho;

    public Quadrado(double tamanho) {
        super(tamanho, tamanho, tamanho, tamanho);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return  "--- Quadrado" +
                "\nTamanho: " + this.tamanho ;
    }
}
