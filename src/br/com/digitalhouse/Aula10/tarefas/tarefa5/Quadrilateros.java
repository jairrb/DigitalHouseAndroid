package br.com.digitalhouse.Aula10.tarefas.tarefa5;

abstract public class Quadrilateros implements FormasGeometricas{
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateros(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double calculoPerimetro() {
        return (a+b+c+d);
    }

    @Override
    public double calculoArea() {
        return (a*b);
    }
}
