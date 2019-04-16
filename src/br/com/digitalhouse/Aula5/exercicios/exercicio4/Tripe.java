package br.com.digitalhouse.Aula5.exercicios.exercicio4;

public class Tripe {
    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void dobrar() {
        this.dobrado = true;
    }

    public void desdobrar() {
        this.dobrado = false;
    }

    public void guardar() {
        dobrar();
        this.alturaAtual = this.alturaMinima;
    }

    public boolean prontoParaGuardar() {
        return isDobrado() && (this.alturaAtual == this.alturaMinima);
    }

    public void usar() {
        desdobrar();
        this.alturaAtual = this.alturaMaxima;
    }

    public boolean prontoParaUsar() {
        return !isDobrado() && (this.alturaAtual > this.alturaMaxima / 2);
    }
}
