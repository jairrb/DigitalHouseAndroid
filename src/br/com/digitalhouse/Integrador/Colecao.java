package br.com.digitalhouse.Integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Colecao {
    private String codigo;
    private Double preco;
    private String descricao;
    private List<Livro> livros = new ArrayList<>();

    public Colecao() {
    }

    public Colecao(String codigo, Double preco, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);

    }

    public void baixaColecao(int quantidade){
        boolean temQuantidade = true;

        for (Livro livro : livros) {
            if (!livro.validaQtdeSolicitada(quantidade)){
                temQuantidade = false;
                break;
            }
        }

        if(temQuantidade){
            for (Livro livro : livros) {
                livro.baixaLivro(quantidade);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colecao colecao = (Colecao) o;
        return Objects.equals(codigo, colecao.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        String livroColecao = "";

        for (Livro livro : livros) {
            livroColecao += livro.toString()+"\n";
        }
        return "CODIGO: " + codigo +
                "\nPRECO: " + preco +
                "\nDESCRICAO: " + descricao +
                "\n\n--- LIVROS COLECAO\n"+livroColecao;

    }
}