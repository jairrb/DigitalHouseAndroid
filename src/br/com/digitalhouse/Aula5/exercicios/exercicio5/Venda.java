package br.com.digitalhouse.Aula5.exercicios.exercicio5;

public class Venda {
    private Double valorDaVenda;
    private Carro veiculoVendido;
    private Clientes cliente;

    public Venda(Double valorDaVenda, Carro veiculoVendido, Clientes cliente) {
        this.valorDaVenda = valorDaVenda;
        this.veiculoVendido = veiculoVendido;
        this.cliente = cliente;
    }
}
