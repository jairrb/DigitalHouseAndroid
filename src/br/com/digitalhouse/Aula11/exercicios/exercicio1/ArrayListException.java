package br.com.digitalhouse.Aula11.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListException {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();
        animais.add("Pato");
        animais.add("Cachorro");
        animais.add("Gato");

        try { //IndexOutOfBoundsException
            System.out.println(animais.get(3));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
