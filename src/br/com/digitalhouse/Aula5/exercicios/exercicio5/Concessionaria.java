package br.com.digitalhouse.Aula5.exercicios.exercicio5;

import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Venda> vendas = new ArrayList<Venda>();

    public void registrarVenda(Carro veiculo, Clientes cliente, Double valor){
        Venda venda = new Venda(valor,veiculo,cliente);
        this.vendas.add(venda);
        System.out.println("Venda registrada");
    }
}
