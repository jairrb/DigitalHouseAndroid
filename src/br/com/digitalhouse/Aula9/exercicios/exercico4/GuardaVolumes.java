package br.com.digitalhouse.Aula9.exercicios.exercico4;
import java.util.*;

public class GuardaVolumes {
    private Map<Integer, List<Peca>> pecasMap = new HashMap<>();
    private int contador = 0;

    public int guardarPecas(List<Peca> listaDePeca){
        contador++;
        System.out.println("--- Adicionando pecas ao guarda volume. Chave gerada: "+contador);
        this.pecasMap.put(contador,listaDePeca);
        return contador;
    }

    public void mostrarPecas(){
        for (Integer chave: this.pecasMap.keySet()) {
            System.out.println("--- Guarda Volumes Numero:\t"+chave);
            for (Peca peca : this.pecasMap.get(chave)){
                System.out.println("Marca: \t"+peca.getMarca()+" \tModelo: "+peca.getModelo());
            }
        }
    }

    public void mostrarPecas(Integer numero){

        if (this.pecasMap.containsKey(numero)) {
            List<Peca> pecas = this.pecasMap.get(numero);

            System.out.println("--- Verificando Guarda Volumes Numero:\t" + numero);
            for (Peca peca : pecas) {
                System.out.println("Marca: \t" + peca.getMarca() + " \tModelo: " + peca.getModelo());
            }
        }else{
            System.out.println("--- Verificando Guarda Volumes --- \nChava informada não encontrada!");
        }
    }

    public void devolverPecas(Integer numero){

        if (this.pecasMap.containsKey(numero)) {
            List<Peca> pecas = this.pecasMap.get(numero);

            System.out.println("--- Retirando Volume --- ");
            for (Peca peca : pecas) {
                peca.retirada();
            }
            this.pecasMap.remove(numero);
        }else{
            System.out.println("--- Verificando Guarda Volumes --- \nChava informada não encontrada!");
        }
    }

}