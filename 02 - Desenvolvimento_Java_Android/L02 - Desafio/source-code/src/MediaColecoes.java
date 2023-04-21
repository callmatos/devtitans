import java.util.Scanner;

public class MediaColecoes {
    
    public static void main(String[] args) {
                              
        double media = 0, cont=0;

        Scanner scan = new Scanner(System.in);
        
        double  v = scan.nextDouble();        
        
        while(v != -1){ 
            media +=v;
            cont+=1;
            v = scan.nextDouble();                                               
        } 
        System.out.printf("%.2f",media/cont );   
    }    
}