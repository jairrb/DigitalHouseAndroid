package br.com.digitalhouse.Aula10.tarefas.tarefa4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private String CNPJ;
    private List<Departamento> departamentos = new ArrayList<>();

    public Empresa(String nomeEmpresa, String CNPJ, List<Departamento> departamentos) {
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
        this.departamentos = departamentos;
    }

    public Empresa(String nomeEmpresa, String CNPJ) {
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void imprimirEmpresa(){
        Funcionario funcionario;
        System.out.println("\n--- IMPRESSAO EMPRESA --- ");
        System.out.println("Empresa: "+this.nomeEmpresa+
                            "\nCNPJ: "+this.CNPJ);

        for (Departamento departamento : this.departamentos) {
            System.out.println("--- Departamento: "+departamento.getNomeDepto()+
                                "\n--- Funcionarios");

            for (int chave : departamento.getFuncionarios().keySet()) {
                funcionario = departamento.getFuncionarios().get(chave);
                System.out.println( "Nome: "+ funcionario.getNome()+
                                    "\t Salario: "+funcionario.getSalario()+
                                    "\t Admissão: "+funcionario.getDataAdmissao());
            }

        }

    }
}
