package br.com.digitalhouse.Aula7.exercicio.voador;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
    private List<Voador> voadores = new ArrayList<Voador>();

    public void adicionarVoador(Voador umVoador) {
        this.voadores.add(umVoador);
    }

    public void voemTodos() {
        for (Voador voador : voadores) {
            voador.voar();
        }
    }
}
