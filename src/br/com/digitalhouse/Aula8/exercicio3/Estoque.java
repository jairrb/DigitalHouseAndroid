package br.com.digitalhouse.Aula8.exercicio3;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque() {
    }

    void mudarNome(String nome){
        System.out.println("---- Atualizando Nome ----"+
                            "\nNome Atual: "+this.nome+
                            "\nNovo Nome: "+nome);
        this.nome = nome;
    }
    void mudarQtdMinima(int qtdMinima){
        System.out.println( "---- Atualizando Quantidade Minima ----"+
                            "\nQtd Atual: "+this.qtdMinima+
                            "\nNova Qtd: "+qtdMinima);
        this.qtdMinima = qtdMinima;
    }

    void repor(int qtd){
        System.out.println( "---- Reposicao de Estoque ----"+
                            "\nQtd Atual: "+this.qtdAtual+
                            "\nNova Qtd: "+(this.qtdAtual + qtd));
        this.qtdAtual += qtd;
    }

    void darBaixa(int qtd){
        if (this.qtdAtual - qtd < 0){
            System.out.println( "---- Baixa de Estoque ----"+
                                "\nQtd Atual("+this.qtdAtual+") - Qtd Baixa("+qtd+") é menor que zero! " +
                                "\nEstoque não pode ficar negativo!");
        }else {
            System.out.println( "---- Baixa de Estoque ----"+
                    "\nQtd Atual: "+this.qtdAtual+
                    "\nNova Qtd: "+(this.qtdAtual - qtd));

            this.qtdAtual -= qtd;
        }
    }


    String mostra(){
        return  "---- Posicao Atual ---- "+
                "\nProduto: " + this.nome +
                "\nQtd atual: " + this.qtdAtual +
                "\nQtd minima: " + this.qtdMinima;
    }

    boolean precisaRepor(){
        return this.qtdAtual <= this.qtdMinima;
    }
}
