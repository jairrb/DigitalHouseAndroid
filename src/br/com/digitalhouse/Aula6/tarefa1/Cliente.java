package br.com.digitalhouse.Aula6.tarefa1;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(int codigo, String nome, Data data){
        super(nome,data);
        this.codigo = codigo;
    }

    @Override
    void imprimeDados() {
        System.out.println("---- Dados Cliente ----");
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nascimento: "+this.dataNascimento());
        System.out.println("Nome: "+this.getNome());
    }
}
