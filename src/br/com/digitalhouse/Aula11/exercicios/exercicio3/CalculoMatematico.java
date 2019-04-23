package br.com.digitalhouse.Aula11.exercicios.exercicio3;

public class CalculoMatematico {

    public double divisao (int numeroA, int numeroB) throws ArithmeticException{
        if (numeroB == 0) {
            throw new ArithmeticException("Nao é possivel dividir por 0");
        }
        return numeroA / numeroB;
    }
}
