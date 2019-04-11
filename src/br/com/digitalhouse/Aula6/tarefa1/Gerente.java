package br.com.digitalhouse.Aula6.tarefa1;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String area, String nome, Data data){
        super(nome,data);
        this.area = area;
    }

    @Override
    public double calculaImpostos() {
        return this.getSalario() * 0.06;
    }

    @Override
    void imprimeDados() {
        System.out.println("---- Dados Gerente ----");
        System.out.println("Geretente: "+this.getNome());
        System.out.println("Area: "+this.area);
        System.out.println("Nascimento: "+this.dataNascimento());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Imposto: "+calculaImpostos());
    }
}
