import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        double raiz = Math.sqrt(scan.nextInt());
        System.out.printf("%.4f\n", raiz);
    }
}