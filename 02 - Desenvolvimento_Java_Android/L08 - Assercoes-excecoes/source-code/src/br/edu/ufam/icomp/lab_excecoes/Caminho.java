package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    

    private Coordenada [] caminho = null;


    private int tamanho = 0;

    public Caminho(int maxTam){

        this.caminho = new Coordenada[maxTam];
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{


        // Primeiro registro
        if( tamanho == 0){
            this.caminho[this.tamanho] = coordenada;
            
            this.tamanho++;

            return;
        }

        int tamanhoAux = this.tamanho + 1;

        if(tamanhoAux > this.caminho.length){
            throw new TamanhoMaximoExcedidoException();

        }else if(tamanho > 0 && coordenada.distancia(caminho[tamanho - 1]) > 15){
            throw new DistanciaEntrePontosExcedidaException("A distancia entre pontos nao pode ser maior que 15m!");
        }else{

            this.caminho[tamanho] = coordenada;
            this.tamanho++;

        }

    }

    public void reset(){
        this.caminho = new Coordenada[this.tamanho];
    }
    
    @Override
    public String toString() {
        
        StringBuffer saida = new StringBuffer("Dados do caminho:");
        saida.append("  - Quantidade de pontos: "+this.tamanho+"\n");
        saida.append("  - Pontos:\n");
        
        for(int i = 0; i < tamanho; i++){
            saida.append("    -> "+this.caminho[i].toString()+"\n");
        } 
        return saida.toString();
    }
}
