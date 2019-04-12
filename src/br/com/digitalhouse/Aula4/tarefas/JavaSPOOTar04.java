package br.com.digitalhouse.Aula4.tarefas;
//Tarefa 4
public class JavaSPOOTar04 {
    public static void main(String[] args) {
        int numAux  = 0;
        int numPrt  = 1;
        while (numAux <= 100){
            if((numPrt % 2) == 1) {
                System.out.println(numPrt);
                numAux++;
            }
            numPrt++;
        }
    }
}
