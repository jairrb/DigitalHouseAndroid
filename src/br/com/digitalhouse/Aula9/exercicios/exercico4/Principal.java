package br.com.digitalhouse.Aula9.exercicios.exercico4;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        List<Peca> pecas = new ArrayList<>();
        pecas.add(new Mochila("Ogio","Mach 5"));
        pecas.add(new Mochila("Oakley","Icon"));

        GuardaVolumes guardaVolumes = new GuardaVolumes();

        guardaVolumes.guardarPecas(pecas);
        guardaVolumes.mostrarPecas();
        guardaVolumes.mostrarPecas(1);
        guardaVolumes.mostrarPecas(2);
        guardaVolumes.devolverPecas(1);
    }
}
