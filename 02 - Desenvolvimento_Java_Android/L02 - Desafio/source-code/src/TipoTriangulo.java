import java.util.Scanner;

public class TipoTriangulo {
   
    public void triangulos(int a, int b, int c){
	
	if((a+b>c) && (a+c>b) && (b+c>a)){
            if(a == b && a == c){
                System.out.println("equilatero");
            }else if((a == b) || (a == c) || (b == c)){
                System.out.println("isosceles");
            }else
                System.out.println("escaleno");
	}else{
            System.out.println("invalido");
        }	
    }
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
	int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        TipoTriangulo triangulo = new TipoTriangulo();
        triangulo.triangulos(a, b, c);
    }    
}