package br.com.digitalhouse.Aula8.exercicio1;

public class Aula {
    private Materia materia;
    private String horaIni;
    private String horaFim;

    public Aula(Materia materia, String horaIni, String horaFim) {
        this.materia = materia;
        this.horaIni = horaIni;
        this.horaFim = horaFim;
    }

    public Aula() {
    }

    public String getMateria() {
        return materia.getNomeMateria();
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
}