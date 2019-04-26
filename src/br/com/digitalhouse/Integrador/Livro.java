package br.com.digitalhouse.Integrador;

import java.util.Objects;

public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private int lancamento;
    private int qtdestoque;
    private String ISBN;
    private Double preco;

    public Livro(String codigo, String titulo, String autor, int lancamento, int qtdestoque, String ISBN, Double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.lancamento = lancamento;
        this.qtdestoque = qtdestoque;
        this.ISBN = ISBN;
        this.preco = preco;
    }

    public Livro() {
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getLancamento() {
        return lancamento;
    }

    public int getEstoque() {
        return qtdestoque;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setEstoque(int qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    public Livro(Double preco) {
        this.preco = preco;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void baixaLivro(int quantidade) {
        if (this.validaQtdeSolicitada(quantidade)){
            this.qtdestoque -= quantidade;
            System.out.println( "CODIGO: "+this.codigo+" TITULO: "+this.titulo+
                    "\nQUANTIDADE VENDIDA: " + quantidade +
                    "\nQUANTIDADE RESTANTE EM ESTOQUE: " + this.qtdestoque + "\n");
        }

    }

    public boolean validaQtdeSolicitada(int quantidade){
        if (quantidade > this.qtdestoque) {
            System.out.println( "CODIGO: "+this.codigo+" TITULO: "+this.titulo+
                    "\nQUANTIDADE NAO DISPONIVEL EM ESTOQUE!" +
                    "\nQUANTIDADE SOLICITADA: " +quantidade+
                    "\nESTOQUE ATUAL: " + this.qtdestoque+ "\n");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(codigo, livro.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "CODIGO: " + codigo +
                "\nTITULO: " + titulo +
                "\nAUTOR: " + autor +
                "\nLANCAMENTO: " + lancamento +
                "\nQUANTIDADE ESTOQUE: " + qtdestoque +
                "\nISBN: " + ISBN +
                "\nPRECO: " + preco + "\n";
    }
}