package br.com.digitalhouse.Aula5.exercicios.exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        Tripe tripe = new Tripe();

        tripe.setAlturaAtual(1);
        tripe.setAlturaMinima(2);
        tripe.setAlturaMaxima(3);

        tripe.dobrar();
        tripe.desdobrar();

        tripe.usar();
        System.out.println("Tripe pronto para usar? " + tripe.prontoParaUsar());

        tripe.guardar();
        System.out.println("Tripe pronto para guardar? " + tripe.prontoParaGuardar());
    }
}
