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

        if((turma.acessivel == true && sala.acessivel == true)
            && (turma.numAlunos <= sala.capacidade)
            //TODO: verificar turma horario deve estar errado
            && turma.horarios.isEmpty()){
                this.ensalamento.add(new TurmaEmSala(turma, sala));
                return true;

            }
            
        return false;
    }

    public void alocarTodas() {

    }

    public int getTotalTurmasAlocadas() {

        int result = 0;
        for (TurmaEmSala ensalamento : this.ensalamento) {
            if (ensalamento.sala != null)
                result+=1;
        }

        return result;
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
        saida.append("Total de Turmas: "+this.turmas.size());
        saida.append("Turmas Alocadas: "+this.getTotalTurmasAlocadas());
        saida.append("Espaços Livres: "+this.getTotalEspacoLivre());

        return saida.toString();
    }

    public String relatorioTurmasPorSala() {

        StringBuffer saida = new StringBuffer();
        saida.append(this.relatorioResumoEnsalamento());

        Parei aqui

        return null;
    }

    public String relatorioSalasPorTurma() {

        return null;
    }
}