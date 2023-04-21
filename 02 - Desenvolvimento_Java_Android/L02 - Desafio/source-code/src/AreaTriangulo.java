import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
       
      //  System.out.println("Digite a raiz");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
       
        if (a < (b + c) && b < (a+c) && c < (a+b)){		

            double s = (a+b+c)/2;
            double raiz = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.printf("%.2f\n", raiz);

        }else{
            System.out.println("Triangulo invalido");
        }     
    }
}