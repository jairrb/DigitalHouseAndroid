package br.com.digitalhouse.Aula6.tarefa1;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, Data data){
        super(nome,data);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaImpostos(){
        return this.salario * 0.03;
    }

    @Override
    void imprimeDados() {
        System.out.println("---- Dados Funcionario ----");
        System.out.println("Funcionario: "+this.getNome());
        System.out.println("Nascimento: "+this.dataNascimento());
        System.out.println("Salario: "+this.salario);
        System.out.println("Imposto: "+calculaImpostos());
    }
}
