package br.com.digitalhouse.Aula10.exercicios.exercicio2;

import java.util.Objects;

public class Coca {
    private Integer tamanho;
    private double preco;

    public Coca(Integer tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho);
    }

}
