import java.util.ArrayList;

import java.util.Scanner;
/**
 *
 * @author oliveira
 */
   
public class SomaColecoes {
      
    ArrayList<Integer> inteiro = new ArrayList();
   
    double media = 0,soma =0;   
  
    public void addInteiro(){
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int ant;
        boolean aux = true;  
        
        do{
            inteiro.add(v);
            ant=v;
            v = scan.nextInt();

            if(ant == -1 && v == -1){              
                aux= false;
                recursivo(inteiro);              
            }
        }while(aux);
   
    }
    public void limpaVariavel(){
        soma =0;
    }
    public  void  recursivo(ArrayList<Integer> inteiro){
       
        for (Integer double1 : inteiro) {
            if (double1 != -1) {                
               // cont = cont +1;
                soma = (soma+double1);              
            }else{
            System.out.printf("%.0f \n",soma);
            limpaVariavel();                
            }   
        }      
    }
    
    public static void main(String[] args) {
      
       SomaColecoes soma = new SomaColecoes();       
            //System.out.println("Digite um número");
            soma.addInteiro();         
    }      
}