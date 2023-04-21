import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        //System.out.println("Digite o numero: ");
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        //int valor =6;
        boolean verdadeiro = true;
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                System.out.print('*');
                System.out.print(' ');
        }
            
            System.out.print('\n');
            if(verdadeiro){
            System.out.print(' ');
            verdadeiro = false;
            }else{
                verdadeiro = true;
            }
        }
       
    }
}
