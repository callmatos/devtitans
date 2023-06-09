import java.util.ArrayList;

public class Ensalamento {

    public ArrayList<Sala> salas = new ArrayList<>();
    public ArrayList<Turma> turmas = new ArrayList<>();
    public ArrayList<TurmaEmSala> ensalamento = new ArrayList<>();

    public Ensalamento() {
        salas = new ArrayList<Sala>();
        turmas = new ArrayList<Turma>();
        ensalamento = new ArrayList<TurmaEmSala>();
    }

    public void addSala(Sala sala) {
        this.salas.add(sala);
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    //Retorna a sala pela turma informada
    public Sala getSala(Turma turma) {

        for (TurmaEmSala ensalSalaTurma : this.ensalamento) {
            if(ensalSalaTurma.turma.equals(turma))
                return ensalSalaTurma.sala;
        }
        return null;
    }

    //Uma determinada sala está disponível em um determinado horário? -- método salaDisponivel(Sala sala, int horario)
    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala ensalSalaTurma : this.ensalamento) {
            if( ensalSalaTurma.sala.equals(sala) && ensalSalaTurma.turma.horarios.contains(horario)){
                return false;
            }
        }
        return true;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (TurmaEmSala ensalSalaTurma : this.ensalamento) {
            if( ensalSalaTurma.sala.equals(sala) && ensalSalaTurma.turma.horarios.containsAll(horarios)){
                return false;
            }
        }

        return true;
    }

    public boolean alocar(Turma turma, Sala sala) {

        if(turmas.contains(turma) && salas.contains(sala) 
            && (turma.acessivel == true && sala.acessivel == true)
            && (turma.numAlunos <= sala.capacidade)
            && salaDisponivel(sala, turma.horarios)){
                this.ensalamento.add(new TurmaEmSala(turma, sala));
                return true;

            }

        return false;
    }

    public void alocarTodas() {
        for (Turma t : turmas) {
            for (Sala s : salas) {
                if (alocar(t, s)) {
                    break;
                }
            }
        }
    }

    public int getTotalTurmasAlocadas() {

        // int result = 0;
        // for (TurmaEmSala ensalamento : this.ensalamento) {
        //     if (ensalamento.sala != null)
        //         result+=1;
        // }

        // return result;
        return ensalamento.size();
    }


    public int getTotalEspacoLivre() {
        int acumulador = 0;

        for (TurmaEmSala enSala : this.ensalamento) {
            acumulador+= enSala.sala.capacidade - enSala.turma.numAlunos;
        }

        return acumulador;
    }

    public String relatorioResumoEnsalamento() {
        
        StringBuffer saida = new StringBuffer();
        
        saida.append("Total de Salas: "+this.salas.size());
        saida.append("\n");
        saida.append("Total de Turmas: "+this.turmas.size());
        saida.append("\n");
        saida.append("Turmas Alocadas: "+this.getTotalTurmasAlocadas());
        saida.append("\n");
        saida.append("Espaços Livres: "+this.getTotalEspacoLivre());

        return saida.toString();
    }

    public String relatorioTurmasPorSala() {

        StringBuffer saida = new StringBuffer();
        saida.append(this.relatorioResumoEnsalamento());
        saida.append("\n");
        saida.append("\n");

        // --- Bloco 2, Sala 102 (80 lugares, acessível) ---
        // String relatorio = "";
        for (Sala s : salas) {
            saida.append("--- "+s.getDescricao()+" ---");
            for (TurmaEmSala ts : ensalamento) {
                if (ts.sala.equals(s)) {
                    saida.append(ts.turma.getDescricao());
                    saida.append("\n");
                }
            }
            saida.append("\n");
        }
        return saida.toString();
    }

    public String relatorioSalasPorTurma() {

        StringBuilder relatorio = new StringBuilder();
        relatorio.append(relatorioResumoEnsalamento());
        relatorio.append("\n");
        relatorio.append("\n");

        for (Turma turma : turmas) {
            relatorio.append(turma.getDescricao());
            relatorio.append("\n");

            // Procura todas as turmas em salas e adiciona ao relatório
            if (!ensalamento.isEmpty()){
                for (TurmaEmSala tes : ensalamento) {
                    if (tes.turma.equals(turma)) {
                        relatorio.append("Sala: "+tes.sala.getDescricao());
                    }
                }
            }else{
                relatorio.append("Sala: SEM SALA");
                relatorio.append("\n");
            }
    }

    return relatorio.toString();
    }
}