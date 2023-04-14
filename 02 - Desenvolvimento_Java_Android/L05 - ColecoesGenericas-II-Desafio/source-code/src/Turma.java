import java.util.ArrayList;

public class Turma {

    public String nome;

    public String professor;

    public int numAlunos;

    public boolean acessivel;

    public ArrayList<Integer> horarios = new ArrayList<>();

    public Turma() {

    }

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {

        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }

    public void addHorario(int horario) {
        this.horarios.add(horario);
    }

    public String getHorariosString() {

        StringBuffer horaS = new StringBuffer();

        for (int i = 0; i < horarios.size(); i++) {

            Integer valorOut = horarios.get(i);

            horaS.append(CalendarioHorarioUtil.getInstance().horaTurma(valorOut)).toString();

            if (i != (horarios.size() - 1))
                horaS.append(", ");

        }

        return horaS.toString();
    }

    public String getDescricao() {

        StringBuffer out = new StringBuffer();

        out.append("Turma: " + this.nome + "\n");
        out.append("Professor: " + this.professor + "\n");
        out.append("Número de Alunos: " + this.numAlunos + "\n");
        out.append("Horário: " + this.getHorariosString() + "\n");
        out.append("Acessível: " + (this.acessivel == true ? "sim" : "não"));

        return out.toString();
    }
}

class CalendarioHorarioUtil {

    private static CalendarioHorarioUtil instance = null;

    private CalendarioHorarioUtil() {
    }


    // Static method
    // Static method to create instance of Singleton class
    public static synchronized CalendarioHorarioUtil getInstance() {
        if (instance == null)
            instance = new CalendarioHorarioUtil();

        return instance;
    }

    public static String horaTurma(Integer hh) {

        final String[] diaSemanaArray = { "segunda", "terça", "quarta", "quinta", "sexta" };
        final int[] hhDias = { 8, 10, 12, 14, 16, 18, 20 };

        int AuxhhDias = hh % 7 == 0 ? 6 : (hh % 7) - 1;
        int auxSemanaArray = 5 - ((35 - hh) / 7) - 1;

        return diaSemanaArray[auxSemanaArray] + " " + hhDias[AuxhhDias] + "hs";
    }
}
