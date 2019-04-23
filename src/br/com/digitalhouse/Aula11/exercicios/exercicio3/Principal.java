package br.com.digitalhouse.Aula11.exercicios.exercicio3;

public class Principal {
    public static void main(String[] args) {
        CalculoMatematico calculoMatematico = new CalculoMatematico();
        try {
            System.out.println(calculoMatematico.divisao(4, 0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
