package br.com.digitalhouse.Aula6.santander;

public class Cheque {
    private Double valor;
    private String bancoEmissor;
    private String dataPagto;

    public Cheque(Double valor,String bancoEmissor,String dataPagto){
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagto = dataPagto;
    }

    public Double getValor() {
        return valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public String getDataPagto() {
        return dataPagto;
    }
}