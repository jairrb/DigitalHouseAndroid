package br.com.digitalhouse.Aula5.exercicios.exercicio1;

public class Conta {
    private String numConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String numeroConta,double saldoCliente,Cliente clienteConta){
        this.numConta = numeroConta;
        this.saldo = saldoCliente;
        this.cliente = clienteConta;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valorDeposito){
        System.out.println("Deposito realizado cliente "+this.cliente.getNome()+", novo saldo: "+(this.saldo+valorDeposito));
    }

    public void saque(double valorSaque){
        if (valorSaque > this.saldo) {
            System.out.println("Saldo Insuficiente cliente "+this.cliente.getNome()+"!");
        } else {
            System.out.println("Saque realizado cliente "+this.cliente.getNome()+", saldo restante: " + (this.saldo - valorSaque));
        }
    }
}
