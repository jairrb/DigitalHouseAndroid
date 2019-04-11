package br.com.digitalhouse.Aula6.santander;

public abstract class Conta {
    private Cliente cliente;
    private Double saldo;

    public Conta(Cliente cliente, Double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(Double valorDeposito){
        System.out.println("----- Deposito  -----");
        this.saldo += valorDeposito;
        System.out.println(" Seu novo saldo e de: "+this.saldo);
    }

    public void sacarDinheiro(Double valorSaque){
        System.out.println("----- Saque  -----");
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println(" Seu novo saldo e de: "+this.saldo);
        } else {
            System.out.println("Saldo não disponivel");
        }
    }
}