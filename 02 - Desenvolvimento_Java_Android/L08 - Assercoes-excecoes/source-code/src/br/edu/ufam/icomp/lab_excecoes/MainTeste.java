package br.edu.ufam.icomp.lab_excecoes;

public class MainTeste {
    
    public static void main(String[] args) {
        
        

        try{
            
            Caminho c = new Caminho(6);

            c.addCoordenada(new Coordenada(5, 32, 7));
            c.addCoordenada(new Coordenada(5, 32, 7));
            c.addCoordenada(new Coordenada(5, 32, 7));
            c.addCoordenada(new Coordenada(5, 32, 7));
            c.addCoordenada(new Coordenada(5, 32, 7));
            c.addCoordenada(new Coordenada(5, 32, 7));

            System.out.println(c.toString());



        }catch(TamanhoMaximoExcedidoException e){
            e.printStackTrace();

        }

        
    }
}
