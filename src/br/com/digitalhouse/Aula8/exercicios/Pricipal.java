package br.com.digitalhouse.Aula8.exercicios;

public class Pricipal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1,"ALUNO1","SILVA");
        Aluno aluno2 = new Aluno(2,"ALUNO2","SOUZA");
        Aluno aluno3 = new Aluno(3,"ALUNO3","SANTOS");

        Professor professor = new Professor(1,"PROFESSOR");

        Materia materia1 = new Materia("POO");
        Materia materia2 = new Materia("UML");

        Aula aula1 = new Aula(materia1,"07:00","08:30");
        Aula aula2 = new Aula(materia2,"08:30","10:30");

        Curso curso = new Curso("ANDROID",professor);

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);

        curso.adicionarAula(aula1);
        curso.adicionarAula(aula2);

        curso.imprimirCurso();

    }
}
