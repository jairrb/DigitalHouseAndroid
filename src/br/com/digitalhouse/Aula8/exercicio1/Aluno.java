package br.com.digitalhouse.Aula8.exercicio1;

public class Aluno {
    private int ra;
    private String nome;
    private String sobrenome;

    public Aluno(int ra, String nome, String sobrenome) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno() {
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void assitirAula() {
        System.out.println("Aluno " + this.nome + " assistindo aula..." );
    }

    public void fazerLicao() {
        System.out.println("Licao feita");
    }

}