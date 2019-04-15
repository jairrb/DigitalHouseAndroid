package br.com.digitalhouse.Aula8.exercicio3;

public class Principal {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Esferograficas", 100, 5);

        System.out.println(estoque.mostra());
        estoque.darBaixa(50);
        estoque.mudarNome("Marca Texto");
        estoque.mudarQtdMinima(10);
        System.out.println(estoque.mostra());
        estoque.darBaixa(60);
        estoque.darBaixa(45);

        System.out.println("Repor Estoque? " + estoque.precisaRepor());

        estoque.repor(95);
        System.out.println(estoque.mostra());


    }
}
