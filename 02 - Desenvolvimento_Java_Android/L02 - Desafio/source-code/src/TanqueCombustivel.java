import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TanqueCombustivel {

    // public double raio, ar;
    //double pi = ;
    public TanqueCombustivel() {
    }

    //HALF_EVEN arredondamento sempre deve acontecer para o valor mais próximo
    public double formata(double valor) {
        BigDecimal big = new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
        return big.doubleValue();
    }

    public double getVolume(int raio) {
        
        double r = 4.0/3.0 * Math.PI * Math.pow(raio, 3);
        return formata(r);

    }

    public double getCalota(int ar, int raio) {
        double x = (Math.PI / 3 * Math.pow(ar, 2) * (3 * raio - ar));
        return formata(x);

    }

    public void calculo(int ar, int raio, int tipo) {
        if (tipo == 1) {
            System.out.print(getCalota(raio, ar));
        } else {
            System.out.printf("%.4f", getVolume(raio));
        }
    }

    public static void main(String[] args) {
        TanqueCombustivel tam = new TanqueCombustivel();
        Scanner scan = new Scanner(System.in);
        int volume = scan.nextInt();
        int ar = scan.nextInt();
        int tipo = scan.nextInt();
         tam.calculo(volume, ar, tipo);
    }
}