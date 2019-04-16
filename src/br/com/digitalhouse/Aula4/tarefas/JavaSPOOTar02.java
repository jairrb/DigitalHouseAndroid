package br.com.digitalhouse.Aula4.tarefas;

//Tarefa 2
public class JavaSPOOTar02 {
    public static void main(String[] args) {
        System.out.println(cadeiaDeTextosDiferentes("DigitalHouse", "HouseDigital"));
    }

    public static boolean cadeiaDeTextosDiferentes(String umTextoA, String umTextoB) {
        return (umTextoA != umTextoB);
    }
}
