package br.com.digitalhouse.Aula5.exercicios.exercicio5;

public class exerecicio5 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", "M5", "Preto", 2019, 0);
        Clientes cliente = new Clientes("João", "Ribeiro", "(11) 99999-8888");
        Concessionaria concessionaria = new Concessionaria();

        concessionaria.registrarVenda(carro, cliente, 694950.0);
    }
}
