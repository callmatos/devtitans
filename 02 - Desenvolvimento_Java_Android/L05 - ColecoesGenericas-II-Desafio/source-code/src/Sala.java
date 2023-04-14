public class Sala {

    public int bloco;

    public int sala;

    public int capacidade;

    public boolean acessivel;

    public Sala() { }

    public Sala(int bloco, int sala, int capacidade, boolean acessivel) {

        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    public String getDescricao() {

        return "Bloco " + this.bloco + ", Sala " + this.sala + " (" + this.capacidade + " lugares, " + this.acesso() + ")";
    }

    private String acesso() {

        if (this.acessivel)
            return "acessível";

        return "não acessível";
    }
}
