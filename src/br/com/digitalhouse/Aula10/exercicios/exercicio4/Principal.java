package br.com.digitalhouse.Aula10.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Funcionario A",123));
        funcionarios.add(new Funcionario("Funcionario B",456));
        funcionarios.add(new Funcionario("Funcionario C",789));
        funcionarios.add(new Funcionario("Funcionario D",987));

        Funcionario funcionario = new Funcionario("Funcinario E",123);

        System.out.println(funcionarios.contains(funcionario));

    }
}
