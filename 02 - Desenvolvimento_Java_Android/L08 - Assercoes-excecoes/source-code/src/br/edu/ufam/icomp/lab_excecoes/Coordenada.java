package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    
    private int posX;

    private int posY;

    private int digito;

    public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {


      if (posX < 0 || posY < 0)
            throw new CoordenadaNegativaException();

        if ((posX < 0 || posX > 30000) || (posY < 0 || posY > 30000))
            throw new CoordenadaForaDosLimitesException();

        
            //disparada quando o resto da divisão da 
            //soma das coordenadas (posX + posY) por 10 for diferente do dígito (que deverá estar entre 0 e 9).
        int validarDigito = (posX + posY) % 10;

        if (digito < 0 || digito > 9)
            throw new DigitoInvalidoException();

        if (validarDigito != digito){
            throw new DigitoInvalidoException();

        }

        this.posX = posX;
        this.posY = posY;
        this.digito = digito;
    }

    

    public double distancia(Coordenada coordenada){
        
        double distanciaAux = 0;
        double posx = this.posX - coordenada.posX;
        double posy = this.posY - coordenada.posY;
        distanciaAux = Math.sqrt(posx * posx + posy * posy);
        return distanciaAux;
    }

    public int getPosX() {
        return posX;
    }



    public void setPosX(int posX) {
        this.posX = posX;
    }



    public int getPosY() {
        return posY;
    }



    public void setPosY(int posY) {
        this.posY = posY;
    }



    public int getDigito() {
        return digito;
    }



    public void setDigito(int digito) {
        this.digito = digito;
    }



    @Override
    public String toString() {
        
        return this.getPosX()+", "+this.getPosY();
    }
}
