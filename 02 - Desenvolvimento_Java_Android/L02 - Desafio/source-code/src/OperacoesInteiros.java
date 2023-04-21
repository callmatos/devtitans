import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperacoesInteiros {
      
    ArrayList<Integer> inteiro = new ArrayList();
    ArrayList<Integer> ordenalista = new ArrayList();
    double media = 0,soma =0;   
    int vpar = 0, vimpar = 0, maior  = 0, menor=1, cont = 0;
             
    public void addInteiro(){
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int ant;
        boolean aux = true;  
        
        do{
          // System.out.println("Digite um número");
            inteiro.add(v);
            ant=v;
            v = scan.nextInt();

            if(ant == -1 && v == -1){              
                aux= false;
              //  System.out.println("dddd"+inteiro.toString());
                recursivo(inteiro);              
            }
        }while(aux);
   
    }
    public void limpaVariavel(){
        cont =0;
        vpar = 0;
        vimpar=0;
        soma =0;
        maior=0;
        menor=1;  
        ordenalista = new ArrayList();
    }
    public void maxMin(){
        Collections.sort(ordenalista);        
        maior = Collections.max(ordenalista);
        menor = Collections.min(ordenalista);
       // System.out.println("orde"+ordenalista.toString());
    }
       
    public  void  recursivo(ArrayList<Integer> inteiro){
       
        for (Integer double1 : inteiro) {
            if (double1 != -1) {                
                cont = cont +1;
                soma = (soma+double1);
                ordenalista.add(double1);
            if(double1 % 2 == 0){
                vpar += 1;          
            }else if(double1 % 2 == 1){
                vimpar += 1;
            }
     
            }else{
   
                maxMin();
                System.out.println(cont);
                System.out.println(vpar);
                System.out.println(vimpar);
                System.out.printf("%.0f \n",soma);
                media = (soma)/cont;
                System.out.printf("%.2f \n",media ); 
                System.out.println(maior);  
                System.out.println(menor); 
               limpaVariavel();                
            }   
        }      
    }
    
    public static void main(String[] args) {
      
       OperacoesInteiros op = new OperacoesInteiros();       
            //System.out.println("Digite um número");
            op.addInteiro();         
    }      
}