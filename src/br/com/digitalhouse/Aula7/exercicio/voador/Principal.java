package br.com.digitalhouse.Aula7.exercicio.voador;

public class Principal {
    public static void main(String[] args) {
        Pato pato = new Pato(100);
        Aviao aviao = new Aviao(0);
        SuperHomem superHomem = new SuperHomem(0);
        TorreDeControle torreDeControle = new TorreDeControle();

        torreDeControle.adicionarVoador(pato);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(superHomem);
        torreDeControle.voemTodos();
    }
}
