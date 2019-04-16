package br.com.digitalhouse.Aula9.exercicios.exercico4;

public class Mochila extends Peca {
    public Mochila(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void retirada() {
        System.out.println( "Retirando mochila marca: " + this.getMarca() +
                                        " e modelo: " + this.getModelo());
    }


}