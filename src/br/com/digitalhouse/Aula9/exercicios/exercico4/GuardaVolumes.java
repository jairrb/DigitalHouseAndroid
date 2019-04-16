package br.com.digitalhouse.Aula9.exercicios.exercico4;
import java.util.*;

public class GuardaVolumes {
    Map<Integer, List<Peca>> pecas = new HashMap<>();
    private int contador = 0;

    public int guardarPecas(List<Peca> listaDePeca){
        contador++;
        this.pecas.put(contador,listaDePeca);
        return contador;
    }

    public void mostrarPecas(){
        for (Integer chave: this.pecas.keySet()) {

        }
    }
}