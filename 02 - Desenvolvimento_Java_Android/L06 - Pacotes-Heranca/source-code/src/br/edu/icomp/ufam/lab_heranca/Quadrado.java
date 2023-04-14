package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{

    public double lado;

    public Quadrado(int posX, int posY, double lado) {
        super(posX, posY, lado, lado);
        
        this.lado = lado;
        
    }

    @Override
    public String toString() {
        
        return "Quadrado na "+super.getPosString()+" com lado de "+this.lado+"cm (área="+super.getArea()+"cm2, perímetro="+super.getPerimetro()+"cm)";
    }
    
}
