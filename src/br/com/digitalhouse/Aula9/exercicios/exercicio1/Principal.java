package br.com.digitalhouse.Aula9.exercicios.exercicio1;
import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Map<Integer,String> loteriaSonhos = new HashMap<>();
        loteriaSonhos.put(0,"Ovos");
        loteriaSonhos.put(2,"Agua");
        loteriaSonhos.put(3,"Escopeta");
        loteriaSonhos.put(4,"Cavalo");
        loteriaSonhos.put(5,"Dentista");

        System.out.println( "---- Loteria Sonhos ---- ");
        for (Integer chave: loteriaSonhos.keySet()) {
            System.out.println( "Loteria: "+loteriaSonhos.get(chave));
        }

        Map<String,List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");
        apelidos.put("Joao",apelidosJoao);


        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");
        apelidos.put("Miguel",apelidosMiguel);


        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");
        apelidos.put("Maria",apelidosMaria);

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");
        apelidos.put("Lucas",apelidosLucas);

        System.out.println( "---- Apelidos ---- ");
        for (String chave: apelidos.keySet()) {
            System.out.println( "Apelidos do\t"+chave);
            for (String apelido : apelidos.get(chave)){
                System.out.println( "\t"+apelido);
            }
        }
    }
}
