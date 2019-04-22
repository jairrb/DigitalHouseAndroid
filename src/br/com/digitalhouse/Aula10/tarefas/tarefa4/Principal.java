package br.com.digitalhouse.Aula10.tarefas.tarefa4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Paul Allen","06.041.510/0001-93");

        List<Departamento> departamentos = new ArrayList<>();

        Departamento TI = new Departamento("TI");
        Departamento Contabil = new Departamento("Contabil");
        Departamento RH = new Departamento("RH");

        departamentos.add(TI);
        departamentos.add(Contabil);
        departamentos.add(RH);

        empresa.setDepartamentos(departamentos);

        Funcionario funcionarioA = new Funcionario("Funcionario A",8000.00,"01/01/2018");
        Funcionario funcionarioB = new Funcionario("Funcionario B",8000.00,"01/02/2018");
        Funcionario funcionarioC = new Funcionario("Funcionario C",7000.00,"01/03/2018");
        Funcionario funcionarioD = new Funcionario("Funcionario D",7000.00,"01/04/2018");
        Funcionario funcionarioE = new Funcionario("Funcionario E",6000.00,"01/05/2018");
        Funcionario funcionarioF = new Funcionario("Funcionario F",6000.00,"01/06/2018");

        TI.addFuncionario(funcionarioA);
        TI.addFuncionario(funcionarioB);
        Contabil.addFuncionario(funcionarioC);
        Contabil.addFuncionario(funcionarioD);
        RH.addFuncionario(funcionarioE);
        RH.addFuncionario(funcionarioF);
        empresa.imprimirEmpresa();

        TI.aumentoSalario();
        TI.imprimirDepto();

        tranfereFuncionario(TI,RH,funcionarioA);
        empresa.imprimirEmpresa();
    }
    
    public static void tranfereFuncionario(Departamento deptoOrigem, Departamento deptoDestino, Funcionario funcionario){
        System.out.println("\n--- TRANFERENCIA FUNCIONARIO ---");
        System.out.println("--- Tranferenrindo Funcionario: "+funcionario.getNome());
        System.out.println("--- Departamento Origem: "+deptoOrigem.getNomeDepto());
        deptoOrigem.getFuncionarios().remove(funcionario.hashCode());
        System.out.println("--- Departamento Destino: "+deptoDestino.getNomeDepto());
        deptoDestino.addFuncionario(funcionario);
    }
}
