package br.com.digitalhouse.Aula11.exercicios.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListException2 {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();
        try {
            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");
            System.out.println(animais.get(5));
        }catch (IndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage() );
            e.printStackTrace();
        }


    }
}
