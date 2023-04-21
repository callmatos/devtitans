import java.util.Scanner;

public class Desconto {
   
    public Desconto() {
        super();
    }
    
    public void calcula(double valor){
        if(valor>199){
            valor =valor - ((valor*5)/100);           
        }
        System.out.printf("%.2f",valor);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        Desconto des = new Desconto();
        des.calcula(valor);
    }
}
