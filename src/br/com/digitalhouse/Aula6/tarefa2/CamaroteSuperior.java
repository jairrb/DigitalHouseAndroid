package br.com.digitalhouse.Aula6.tarefa2;

public class CamaroteSuperior extends Vip {
    private double adicionalSup = 50;

    public void valorSup() {
        System.out.println("---- Camarote Superior ----");
        super.setValor(super.valorVip() + this.adicionalSup);
    }
}
