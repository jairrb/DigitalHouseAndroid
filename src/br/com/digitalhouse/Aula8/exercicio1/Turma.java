package br.com.digitalhouse.Aula8.exercicio1;

public class Turma {
    private String nomeTuma;
    private Curso curso;

    public Turma(String nomeTuma, Curso curso) {
        this.nomeTuma = nomeTuma;
        this.curso = curso;
    }

    public Turma() {
    }

    public String getNomeTuma() {
        return nomeTuma;
    }

    public void setNomeTuma(String nomeTuma) {
        this.nomeTuma = nomeTuma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    public void imprimirTurma() {
        System.out.println("---- Detalhes Curso ----");
        System.out.println("Turma: " + this.nomeTuma);
        System.out.println("Nome do Curso: " + this.curso.getNome());
        System.out.println("Professor: " + this.curso.getProfessor().getNome());
        this.curso.getProfessor().darAulas();

        System.out.println("---- Materias ----");
        for (Aula aula : this.curso.getAulas()) {
            System.out.println("Materia: " + aula.getMateria());
            System.out.println("Hora Inicial: " + aula.getHoraIni());
            System.out.println("Hora Final: " + aula.getHoraFim());
        }

        System.out.println("---- Alunos ----");
        for (Aluno aluno : this.curso.getAlunos()) {
            aluno.assitirAula();
            System.out.println("RA: " + aluno.getRa());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Sobrenome: " + aluno.getSobrenome());
        }

        this.curso.getProfessor().fazerChamada();
    }
}
