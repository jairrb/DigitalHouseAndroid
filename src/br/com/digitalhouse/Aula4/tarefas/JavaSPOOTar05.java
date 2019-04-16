package br.com.digitalhouse.Aula4.tarefas;

//Tarefa 5
public class JavaSPOOTar05 {
    public static void main(String[] args) {
        System.out.println(algumMaior(1, 6, 3, 4));
    }

    public static boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD) {
        return (umNumeroA > umNumeroC && umNumeroA > umNumeroD) || (umNumeroB > umNumeroC && umNumeroB > umNumeroD);
    }
}
