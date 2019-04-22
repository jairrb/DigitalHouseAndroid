package br.com.digitalhouse.Aula10.tarefas.tarefa4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Departamento {
    private String nomeDepto;
    private Map<Integer,Funcionario> funcionarios = new HashMap<>();

    public Departamento(String nomeDepto, Map<Integer,Funcionario> funcionarios) {
        this.nomeDepto = nomeDepto;
        this.funcionarios = funcionarios;
    }

    public Departamento(String nomeDepto) {
        this.nomeDepto = nomeDepto;
    }

    public String getNomeDepto() {
        return nomeDepto;
    }

    public void setNomeDepto(String nomeDepto) {
        this.nomeDepto = nomeDepto;
    }

    public Map<Integer, Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Map<Integer, Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        System.out.println("Adicionando Funcionario para Depto: "+this.nomeDepto);
        this.funcionarios.put(funcionario.hashCode(),funcionario);
    }

    public void aumentoSalario(){
        System.out.println("\n--- AUMENTO DE SALARIO --- ");
        System.out.println("Aumento de Salario para Depto: "+this.nomeDepto);
        for (int chave : this.funcionarios.keySet()) {
            funcionarios.get(chave).setSalario(funcionarios.get(chave).getSalario() +
                                                (funcionarios.get(chave).getSalario() *0.10));
        }
    }

    public void imprimirDepto(){
        Funcionario funcionario;
        System.out.println("\n--- IMPRESSAO DEPARTAMENTO --- ");
        System.out.println("--- Departamento: "+this.nomeDepto+
                "\n--- Funcionarios");

        for (int chave : this.getFuncionarios().keySet()) {
            funcionario = this.getFuncionarios().get(chave);
            System.out.println( "Nome: "+ funcionario.getNome()+
                    "\t Salario: "+funcionario.getSalario()+
                    "\t Admissão: "+funcionario.getDataAdmissao());
        }
    }
}
