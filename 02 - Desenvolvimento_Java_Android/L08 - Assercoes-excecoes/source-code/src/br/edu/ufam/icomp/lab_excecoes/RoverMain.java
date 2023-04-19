package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    
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
            System.out.println(e.getMessage());

        }catch(DistanciaEntrePontosExcedidaException e){
            System.out.println(e.getMessage());

        }catch(DigitoInvalidoException e){
            System.out.println(e.getMessage());

        }catch(CoordenadaForaDosLimitesException e){
            System.out.println(e.getMessage());

        }catch(CoordenadaNegativaException e){
            System.out.println(e.getMessage());

        }

        
    }
}
