package br.com.digitalhouse.Aula10.pratica;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Curso cursoFull = new Curso("Full Stack");
        Curso cursoAndroid = new Curso("Android");

        Aluno alunoA = new Aluno(101,"Aluno","ABC",20,cursoFull);
        Aluno alunoB = new Aluno(102,"Aluno","DEF",30,cursoAndroid);
        Aluno alunoC = new Aluno(103,"Aluno","GHI",35,cursoAndroid);
        Aluno alunoD = new Aluno(104,"Aluno","JKL",35,cursoFull);
        Aluno alunoE = new Aluno(105,"Aluno","JKL",35,cursoFull);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(alunoA);
        alunos.add(alunoB);
        alunos.add(alunoC);
        alunos.add(alunoD);
        alunos.add(alunoE);

        System.out.println(alunoD.equals(alunoE));
        System.out.println(alunos.contains(alunoE));

        //Retorna Hash Code do objeto
        System.out.println(alunoD.hashCode());
        System.out.println(alunoE.hashCode());

        //Imprime objeto
        System.out.println(alunoE.toString());

        //Imprime lista completa
        System.out.println(alunos.toString());

    }
}