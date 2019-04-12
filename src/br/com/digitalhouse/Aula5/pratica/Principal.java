package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        Dono jair = new Dono("Jair Ribeiro");
        Dono angela = new Dono();
        Cachorro doguinho = new Cachorro();

        doguinho.nome = "Bidu";
        doguinho.raca = "Vira-Lata";

        System.out.println(jair.getNome());
        jair.sexo = "M";
        System.out.println(jair.sexo);
        angela.setNome("Angela");
        System.out.println(angela.getNome());
        jair.alimentar(doguinho);
    }
}
