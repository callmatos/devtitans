import java.util.Scanner;

public class AnimaisCedulas {
    
    public String[] animais ={"Tartaruga","Garça","Arara","Mico-leão-dourado","Onça-pintada","Garoupa"};
    
    public void verficaValor(int valor){
        switch (valor) {
            case 2:
                System.out.println(animais[0]);
                break;
            case 5:
                System.out.println(animais[1]);
                break;
            case 10:
                System.out.println(animais[2]);
                break;
            case 20:
                System.out.println(animais[3]);
                break;
            case 50:
                System.out.println(animais[4]);
                break;
            case 100:
                System.out.println(animais[5]);
                break;
            default:
                System.out.println("erro");  
    }
     
    }
    
    public static void main(String[] args){
        AnimaisCedulas cedulas = new AnimaisCedulas();
        
        Scanner scan = new Scanner(System.in);
        
        int numero = scan.nextInt();
        cedulas.verficaValor(numero);  
    }    
}