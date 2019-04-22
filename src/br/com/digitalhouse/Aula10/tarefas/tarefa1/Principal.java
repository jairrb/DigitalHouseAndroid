package br.com.digitalhouse.Aula10.tarefas.tarefa1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero = 0;
        int antecessor = 0;
        int sucessor = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();

        antecessor = numero-1;
        sucessor = numero+1;
        System.out.println( "Numero Digitado: "+numero+
                            "\nAntecessor: "+antecessor+
                            "\nSucessor: "+sucessor);

    }
}
