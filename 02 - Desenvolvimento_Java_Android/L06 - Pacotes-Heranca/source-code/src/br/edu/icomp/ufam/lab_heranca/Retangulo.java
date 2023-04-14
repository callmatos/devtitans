package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
    

    public double largura;

    public double altura;

    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.largura * this.altura;
    }

    @Override
    public double getPerimetro() {
        return 2*(this.largura + this.altura);
    }

    @Override
    public String toString() {

        return "Retângulo na "+super.getPosString()+" com largura de "+this.largura+"cm e altura de "+this.altura+"cm (área="+this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)";
    }


}
