package br.com.digitalhouse.Aula6.tarefa2;

public class CamaroteInferior extends Vip{
    private String localizacao = "A1";

    public String getLocalizacao() {
        System.out.println("---- Camarote Inferior ----");
        super.setValor(super.valorVip());
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void PrttLocalizacao() {
        System.out.println(this.localizacao);
    }
}
