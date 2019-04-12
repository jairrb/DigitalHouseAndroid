package br.com.digitalhouse.Aula5.exercicios.exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol jogadorUm = new JogadorDeFutebol("Messi");
        JogadorDeFutebol jogadorDois = new JogadorDeFutebol("Ronaldo");
        SessaoDeTreinamento sessaoTreino = new SessaoDeTreinamento(1);

        jogadorUm.setGols(0);
        jogadorUm.setExperiencia(3);
        jogadorUm.setEnergia(40);
        jogadorUm.setAlegria(10);

        jogadorDois.setGols(0);
        jogadorDois.setExperiencia(5);
        jogadorDois.setEnergia(50);
        jogadorDois.setAlegria(5);

        sessaoTreino.treinarA(jogadorUm);
        sessaoTreino.treinarA(jogadorDois);
    }
}