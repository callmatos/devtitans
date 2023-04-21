import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaVolume {
    public double raio;
    double pi = Math.PI;
    public AreaVolume() {
    }

    public AreaVolume(double raio) {
        this.raio = formata(raio);
    }
    // HALF_EVEN arredondamento sempre deve acontecer para o valor mais próximo
     public double formata(double valor){
        BigDecimal big = new  BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        return big.doubleValue();
    }
    
    public double getArea() {		
		double area = pi * Math.pow(raio, 2);
		return formata(area);
	}
    
    public double getVolume(){
            double volume = (4.0/3.0 * pi * Math.pow(raio, 3));
        return formata(volume);
        
    }
    public String formataArea(double raio){
        DecimalFormat df = new DecimalFormat("###.00");
          df.setRoundingMode(RoundingMode.UP);
        return df.format(raio);
    }
    @Override
    public String toString() {
        String st1 = "Um circulo com raio de "+formataArea(raio)+" centimetros tem uma area de "+getArea()+" centimetros quadrados.";
        String st2 = "Uma esfera com raio de "+formataArea(raio)+" centimetros tem um volume de "+getVolume()+" centimetros cubicos.";
        return  st1+"\n"+st2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        AreaVolume av = new AreaVolume(valor);
        System.out.println(av.toString());
    
    }
}
