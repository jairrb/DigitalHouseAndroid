package br.com.digitalhouse.Aula6.tarefa2;

public class Ingresso {
    private double valor = 100;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso: "+this.valor);
    }
}