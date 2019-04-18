package br.com.digitalhouse.Aula10.pratica;

import java.util.Objects;

public class Aluno {
    private int ra;
    private String nome;
    private String sobrenome;
    private int idade;
    private Curso curso;

    public Aluno(int ra, String nome, String sobrenome, int idade, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno() {
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return ra == aluno.ra &&
                idade == aluno.idade &&
                Objects.equals(nome, aluno.nome) &&
                Objects.equals(sobrenome, aluno.sobrenome) &&
                curso.equals(aluno.curso);
    }

    @Override
    public int hashCode() {
        return ra + nome.hashCode();
        //return Objects.hash(ra, nome, sobrenome, idade, curso);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", " + curso.toString() +
                '}';
    }
}