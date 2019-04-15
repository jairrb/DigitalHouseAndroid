package br.com.digitalhouse.Aula8.exercicio2;

public class Itens {
    private int numero;
    private String descricao;
    private int quantidade;
    private Double precoUnit;

    public Itens(int numero, String descricao, int quantidade, Double precoUnit) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = (quantidade > 0) ? quantidade : 0;
        this.precoUnit = (precoUnit > 0) ? precoUnit : 0;
    }

    public Itens(int numero) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
       this.quantidade = (quantidade > 0) ? quantidade : 0;

    }

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = (precoUnit > 0) ? precoUnit : 0;
    }
}
