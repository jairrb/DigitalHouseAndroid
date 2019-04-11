package br.com.digitalhouse.Aula6.santander;

public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(Double limite, Cliente cliente, Double saldo){
        super(cliente,saldo);
        this.limite = limite;
    }

    public void depositarCheque(Cheque cheque) {
        System.out.println("Desposito em cheque");
        System.out.println("Banco Origem: "+cheque.getBancoEmissor());
        System.out.println("Valor: "+cheque.getValor());
        this.setSaldo(this.getSaldo()+cheque.getValor());
        System.out.println("Novo saldo em conta corrente: "+this.getSaldo());
    }

    @Override
    public void sacarDinheiro(Double valorSaque) {
        boolean podeSacar = false;
        System.out.println("----- Saque -----");
        if(this.getSaldo()+this.limite >= valorSaque){
            podeSacar = true;
            if ((valorSaque > this.getSaldo())){
                System.out.println("Voce utilizara seu limite de cheque especial! Cobraremos apenas um rim de juros!");
            }else{
                System.out.println("Parabens guerreiro voce tem dinheiro na conta!");
            }
        }else{
            System.out.println("Final de mes ne amigao! Voce nao possui saldo suficiente!");
        }
        if (podeSacar) {
            this.setSaldo(this.getSaldo()-valorSaque);
            System.out.println("Saque realizado aproveite a sexta-feira! Seu novo saldo e de: "+this.getSaldo());
        }
    }
}