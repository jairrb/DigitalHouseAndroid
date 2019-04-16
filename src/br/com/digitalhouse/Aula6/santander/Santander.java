package br.com.digitalhouse.Aula6.santander;

public class Santander {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNumeroCliente("987654");
        cliente.setSobrenome("Ribeiro");
        cliente.setNumeroCPF("999.888.777.666-55");
        cliente.setNumeroRG("99.000.777-X");

        ContaCorrente contaCorrente = new ContaCorrente(1000.00, cliente, 100.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0.60, cliente, 1000.00);
        Cheque cheque = new Cheque(1500.00, "Itau", "20190410");

        contaPoupanca.depositarDinheiro(150.00);
        contaPoupanca.recolherJuros();
        contaPoupanca.sacarDinheiro(10000.00);

        contaCorrente.depositarCheque(cheque);
        contaCorrente.sacarDinheiro(100.00);
        contaCorrente.sacarDinheiro(1600.00);
    }
}
