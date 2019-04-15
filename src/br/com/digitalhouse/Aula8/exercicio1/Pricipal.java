package br.com.digitalhouse.Aula8.exercicio1;

public class Pricipal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "John", "McAfee");
        Aluno aluno2 = new Aluno(2, "Martin", "Cooper");
        Aluno aluno3 = new Aluno(3, "Ralph", "Baer");

        Professor professor = new Professor(1, "Tairo/Jessica");

        Materia materia1 = new Materia("POO");
        Aula aula1 = new Aula(materia1, "07:00", "08:30");

        Materia materia2 = new Materia("UML");
        Aula aula2 = new Aula(materia2, "08:30", "10:30");

        Curso curso = new Curso("Mobile Android", professor);

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);

        curso.adicionarAula(aula1);
        curso.adicionarAula(aula2);

        Turma turma = new Turma("MobileAndroid-0219MOACN01O", curso);

        turma.imprimirTurma();

    }
}
