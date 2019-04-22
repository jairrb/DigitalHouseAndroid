package br.com.digitalhouse.Aula10.tarefas.tarefa5;

public class Retangulo extends Quadrilateros {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "--- Retangulo" +
                "\nBase: " + base +
                "\nAltura: " + altura ;
    }
}