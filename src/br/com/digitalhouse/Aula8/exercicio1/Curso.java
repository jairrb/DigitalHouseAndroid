package br.com.digitalhouse.Aula8.exercicio1;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private Professor professor;
    private ArrayList<Aula> aulas = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }
    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarAula(Aula aula) {
        this.aulas.add(aula);

    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);

    }
}
