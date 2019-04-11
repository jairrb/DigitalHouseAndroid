package br.com.digitalhouse.Aula6.tarefa2;

public class Vip extends Ingresso {
    private double adicionalVip = 50;

    public double valorVip(){
        return super.getValor()+this.adicionalVip;
    }
}
