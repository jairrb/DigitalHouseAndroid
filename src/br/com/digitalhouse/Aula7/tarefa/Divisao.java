package br.com.digitalhouse.Aula7.tarefa;

public class Divisao implements OperacaoMatematica{

    @Override
    public float Calcula(float a, float b) {
        if(b == 0){
            System.out.println("Nao existe divisao por 0 (zero)!");
            return 0;
        }else{
            return a/b;
        }

    }
}
