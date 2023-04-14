package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{

    public double raio;

    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
        
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        
        return "Círculo na "+super.getPosString()+" com raio de "+this.raio+"cm (área="+this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)";
    }
    

}
