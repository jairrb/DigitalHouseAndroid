package br.com.digitalhouse.Aula8.exercicios;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private Professor professor;
    private ArrayList<Aula> aulas = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public Curso(String nome,Professor professor) {
        this.nome = nome;
        this.professor = professor;
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

    public void adicionarAula(Aula aula){
        this.aulas.add(aula);

    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);

    }

    public void imprimirCurso() {
        System.out.println("---- Detalhes Curso ----");
        System.out.println("Nome do Curso: "+this.nome);
        System.out.println("Professor: "+this.professor.getNome());

        System.out.println("---- Materias ----");
        for (Aula aula : aulas) {
            System.out.println("Materia: "+aula.getMateria());
            System.out.println("Hora Inicial: "+aula.getHoraIni());
            System.out.println("Hora Final: "+aula.getHoraFim());
        }

        System.out.println("---- Alunos ----");
        for (Aluno aluno : alunos) {
            System.out.println("RA: "+aluno.getRa());
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("Sobrenome: "+aluno.getSobrenome());
        }
    }
}
