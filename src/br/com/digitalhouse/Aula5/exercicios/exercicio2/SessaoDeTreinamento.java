package br.com.digitalhouse.Aula5.exercicios.exercicio2;

public class SessaoDeTreinamento {
    private int experiencia;

    public SessaoDeTreinamento(int experienciaTreino) {
        this.experiencia = experienciaTreino;
    }

    public void treinarA(JogadorDeFutebol jogador) {
        int experiencia = jogador.getExperiencia();

        System.out.println("- - - - Treino jogador " + jogador.getNome() + " - - - - ");
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        System.out.println("Experiencia Inicial Jogador: " + experiencia);
        experiencia += this.experiencia;
        jogador.setExperiencia(experiencia);
        System.out.println("Experiencia Final Jogador: " + experiencia);
    }
}
