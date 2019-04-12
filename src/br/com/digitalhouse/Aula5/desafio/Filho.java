package br.com.digitalhouse.Aula5.desafio;

public class Filho {
    private String mae;
    private String pai;
    private String nome;

    //contrutor especifico
    public Filho(String nomeMae,String nomePai, String nomeFilho)
    {
        this.mae = nomeMae;
        this.pai = nomePai;
        this.nome = nomeFilho;
    }

    //Get Mae
    public String getMae() {
        return mae;
    }
    //Get Pai
    public String getPai() {
        return pai;
    }
    //Get Filho
    public String getNome() {
        return nome;
    }

    //Set Mae
    public void setMae(String nomeMae){
        this.mae = nomeMae;
    }
    //Set Pai
    public void setPai(String nomePai){
        this.pai = nomePai;
    }
    //Set Filho
    public void setNome(String nome) {
        this.nome = nome;
    }
}
