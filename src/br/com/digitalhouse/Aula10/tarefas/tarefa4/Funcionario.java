package br.com.digitalhouse.Aula10.tarefas.tarefa4;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private Double salario;
    private String dataAdmissao;

    public Funcionario(String nome, Double salario, String dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataAdmissao);
    }
}
