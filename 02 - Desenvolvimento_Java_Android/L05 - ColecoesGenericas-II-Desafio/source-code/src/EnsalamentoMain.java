public class EnsalamentoMain {


    public static void main(String[] args){
        
        
        // Ensalamento e1 = new Ensalamento();
        // Sala s1 = new Sala(2, 102, 80, true);
        // e1.addSala(s1);
        // Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true);
        // t1.addHorario(7);
        // t1.addHorario(21);
        // t1.addHorario(35); 
        // e1.addTurma(t1); 
        // // System.out.println(e1.relatorioTurmasPorSala());
        // // System.out.println(e1.relatorioTurmasPorSala());
        // System.out.println(e1.relatorioSalasPorTurma());

        // /**
        //  * Total de Salas: 1 
        //  * Total de Turmas: 1 
        //  * Turmas Alocadas: 0 
        //  * Espaços Livres: 0 
        //  * 
        //  * Turma: Organização de Computadores 
        //  * Professor: Andrew S. Tanenbaum 
        //  * Número de Alunos: 70 
        //  * Horário: segunda 20hs, quarta 20hs, sexta 20hs 
        //  * Acessível: sim 
        //  * Sala: SEM SALA 
        //  * 
        //  *  
        //  */

        // Ensalamento e1 = new Ensalamento();
        // Sala s1 = new Sala(2, 102, 80, true);
        // e1.addSala(s1);
        // Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true);
        // t1.addHorario(7);
        // t1.addHorario(21);
        // t1.addHorario(35);
        // e1.addTurma(t1);
        // Sala s2 = new Sala(2, 202, 100, false);
        // e1.addSala(s2);
        // e1.alocar(t1, s2);
        // Sala s3 = new Sala(2, 301, 50, true);
        // e1.addSala(s3); 
        // e1.alocar(t1, s3);
        // System.out.println(e1.alocar(t1, s1));

        // Ensalamento e1 = new Ensalamento(); 
        // Sala s1 = new Sala(2, 102, 80, true); 
        // e1.addSala(s1); 
        // Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true); 
        // t1.addHorario(7); 
        // t1.addHorario(21); 
        // t1.addHorario(35); 
        // e1.addTurma(t1); 
        // Sala s2 = new Sala(2, 202, 100, false); 
        // e1.addSala(s2); 
        // e1.alocar(t1, s2); 
        // Sala s3 = new Sala(2, 301, 50, true); 
        // e1.addSala(s3); 
        // e1.alocar(t1, s3); 
        // e1.alocar(t1, s1); 
        // System.out.println(e1.relatorioTurmasPorSala()); 
        
        // /**
        //  * Total de Salas: 3 
        //  * Total de Turmas: 1 
        //  * Turmas Alocadas: 1 
        //  * Espaços Livres: 10 
        //  * 
        //  * --- Bloco 2, Sala 102 (80 lugares, acessível) --- 
        //  * 
        //  * Turma: Organização de Computadores 
        //  * Professor: Andrew S. Tanenbaum [NL] Número de Alunos: 70 
        //  * Horário: segunda 20hs, quarta 20hs, sexta 20hs 
        //  * Acessível: sim 
        //  * 
        //  * --- Bloco 2, Sala 202 (100 lugares, não acessível) --- 
        //  * 
        //  * --- Bloco 2, Sala 301 (50 lugares, acessível) --- 
        //  *  
        //  * 
        //  */

        Ensalamento e1 = new Ensalamento();
        Sala s1 = new Sala(2, 102, 80, true);
        e1.addSala(s1);
        Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true); 
        t1.addHorario(7); 
        t1.addHorario(21);
        t1.addHorario(35);
        e1.addTurma(t1);

        

        Sala s2 = new Sala(2, 202, 100, false);
        e1.addSala(s2); 
        e1.alocar(t1, s2);
        Sala s3 = new Sala(2, 301, 50, true); 
        e1.addSala(s3); 
        
        
        e1.alocar(t1, s3);
        e1.alocar(t1, s1);
        System.out.println(e1.relatorioSalasPorTurma());
         
    }
}
