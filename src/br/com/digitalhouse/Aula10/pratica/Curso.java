package br.com.digitalhouse.Aula10.pratica;

import java.util.Objects;

public class Curso {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }
}