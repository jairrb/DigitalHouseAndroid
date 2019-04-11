package br.com.digitalhouse.Aula6.tarefa1;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    public Pessoa(String nome,Data nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    public String dataNascimento(){
        return this.nascimento.getDia()+"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno();
    }
    abstract void imprimeDados();
}
