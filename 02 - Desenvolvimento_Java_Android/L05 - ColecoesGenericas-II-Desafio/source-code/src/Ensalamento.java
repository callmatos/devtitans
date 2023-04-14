import java.util.ArrayList;

public class Ensalamento {

    public ArrayList<Sala> salas = new ArrayList<>();

    public ArrayList<Turma> turmas = new ArrayList<>();

    public ArrayList<TurmaEmSala> ensalamento = new ArrayList<>();

    public Ensalamento() {

    }

    public void addSala(Sala sala) {

        this.salas.add(sala);
    }

    public void addTurma(Turma turma) {

        this.turmas.add(turma);
    }

    public Sala getSala(Turma turma) {

        return null;
    }

    public boolean salaDisponivel(Sala sala, int horario) {

        return false;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {

        return false;
    }

    public boolean alocar(Turma turma, Sala sala) {

        return false;
    }

    public void alocarTodas() {

    }

    public int getTotalTurmasAlocadas() {

        return 0;
    }


    public int getTotalEspacoLivre() {

        return 0;
    }

    public String relatorioResumoEnsalamento() {

        return null;
    }

    public String relatorioTurmasPorSala() {

        return null;
    }

    public String relatorioSalasPorTurma() {

        return null;
    }
}