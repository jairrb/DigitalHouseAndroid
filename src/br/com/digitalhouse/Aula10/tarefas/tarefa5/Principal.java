package br.com.digitalhouse.Aula10.tarefas.tarefa5;

public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2.0);
        Retangulo retangulo = new Retangulo(2.0,3.0);
        Circulo circulo = new Circulo(3.0);

        System.out.println(quadrado.toString());
        System.out.println("Valor Area: "+quadrado.calculoArea());
        System.out.println("Valor Perimetro: "+quadrado.calculoPerimetro());

        System.out.println(retangulo.toString());
        System.out.println("Valor Area: "+retangulo.calculoArea());
        System.out.println("Valor Perimetro: "+retangulo.calculoPerimetro());

        System.out.println(circulo.toString());
        System.out.println("Valor Area: "+circulo.calculoArea());
        System.out.println("Valor Perimetro: "+circulo.calculoPerimetro());
    }
}
