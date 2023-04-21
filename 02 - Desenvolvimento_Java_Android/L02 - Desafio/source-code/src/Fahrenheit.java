import java.text.DecimalFormat;
import java.util.Scanner;

public class Fahrenheit {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        Scanner scan = new Scanner(System.in);
        
        double fahrenheit;
        
        // initialising
        int celsius = scan.nextInt();

            
        // formula for conversion
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(df.format(fahrenheit));

    }
}