package br.com.digitalhouse.Aula5.exercicios.exercicio3;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldadeProva, int energiaNecessariaProva) {
        this.dificuldade = dificuldadeProva;
        this.energiaNecessaria = energiaNecessariaProva;
    }

    public boolean podeRealizar(Atleta atleta) {
        if (atleta.getEnergia() >= this.energiaNecessaria && atleta.getNivel() >= this.dificuldade) {
            return true;
        } else {
            return false;
        }
    }

    public void melhorNaProva(Atleta atleta1, Atleta atleta2) {

        if (podeRealizar(atleta1) && !podeRealizar(atleta2)) {
            System.out.println("Atleta " + atleta1.getNome() + " melhor!");
        } else if (!podeRealizar(atleta1) && podeRealizar(atleta2)) {
            System.out.println("Atleta " + atleta2.getNome() + " melhor!");
        } else {
            System.out.println("Empate!!!");
        }
    }
}
