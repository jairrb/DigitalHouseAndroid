package br.com.digitalhouse.Aula10.tarefas.tarefa5;

public class Circulo implements FormasGeometricas{
    private double raio;
    private double pi = 3.1416;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "--- Circulo" +
                "\nRaio: " + raio;
    }

    @Override
    public double calculoArea() {

        return this.pi*Math.pow(this.raio,2);
    }

    @Override
    public double calculoPerimetro() {
        return (this.pi*this.raio)*2;
    }
}
