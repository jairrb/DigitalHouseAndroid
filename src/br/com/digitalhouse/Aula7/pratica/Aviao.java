package br.com.digitalhouse.Aula7.pratica;

public class Aviao implements Voador {
    private String tipoDeAsa;
    private int qtdAssentos;

    public Aviao(String tipoAsa, int qtd) {
        this.tipoDeAsa = tipoAsa;
        this.qtdAssentos = qtd;
    }

    public Aviao() {
    }

    public String getTipoDeAsa() {
        return tipoDeAsa;
    }

    public void setTipoDeAsa(String tipoDeAsa) {
        this.tipoDeAsa = tipoDeAsa;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    @Override
    public void voar() {
        System.out.println("Voa Batman!!!");
    }
}
