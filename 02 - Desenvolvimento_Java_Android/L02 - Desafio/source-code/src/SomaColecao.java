import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) {
                              
        double soma = 0;    
        Scanner scan = new Scanner(System.in);
           // System.out.println("Digite numero1: " );
        double  v = scan.nextDouble();  
       
        while(v != -1){ 
            soma +=v;
                      // cont+=1;
            v = scan.nextDouble();                                               
        } 
        System.out.println(soma );   
    }   
}