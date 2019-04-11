package br.com.digitalhouse.Aula6.santander;

public class ContaPoupanca extends Conta{
    private Double juros;

    public ContaPoupanca(Double juros, Cliente cliente, Double saldo){
        super(cliente,saldo);
        this.juros = juros;
    }

    public void recolherJuros() {
        if (this.juros > 0) {
            System.out.println(" Voce teve um misero rendimento de : "+(this.getSaldo()*(this.juros/100)));
            this.setSaldo(this.getSaldo() + (this.getSaldo()*(this.juros/100)));
            System.out.println(" Seu novo saldo e de: "+this.getSaldo());
        } else {
            System.out.println("Não há saldo a recolher!");
        }
    }
}
