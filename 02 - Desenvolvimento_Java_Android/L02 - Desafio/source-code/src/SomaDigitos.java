import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDigitos {
    
    public static List<Integer> SeparaDigitos(int valor) {
        List<Integer> numerosGerados = new ArrayList<>();
        int positivo = Math.abs(valor);
        int tamanho = (int)(Math.log10(positivo) + 1);
        int posicao = 0;
        while(posicao < tamanho) {
            int digito = valor / (int)Math.pow(10, tamanho - posicao - 1) * Integer.signum(valor);
            numerosGerados.add(digito);
            valor %= digito * Math.pow(10, tamanho - posicao - 1);
            posicao++;
        }
        return numerosGerados;
    }

    public static void ImprimeSomaLista(List<Integer> lista) {
        int soma = 0;
        for (int item : lista) {
            soma = soma+item;
        }
        System.out.println(soma);
    }
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
        ImprimeSomaLista(SeparaDigitos(a));
      
    }
    
}
