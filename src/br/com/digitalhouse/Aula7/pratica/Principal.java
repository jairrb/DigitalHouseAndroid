package br.com.digitalhouse.Aula7.pratica;

public class Principal {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        aviao.setTipoDeAsa("Normal");
        aviao.setQtdAssentos(120);

        aviao.voar();
    }
}
