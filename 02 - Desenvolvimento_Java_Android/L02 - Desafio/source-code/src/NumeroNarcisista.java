import java.text.DecimalFormat;
import java.util.Scanner;

public class NumeroNarcisista {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // initialising
        String valor = scan.nextLine();
        System.out.println(getResult(valor));

    }

    static String getResult(String st)
{
    int sum = 0;
    int length = st.length();
     
    for (int i = 0; i < length; i++)
    {
        sum = sum + (int)Math.pow(st.charAt(i) - '0', length);
    }
     
    int number = Integer.parseInt(st);

    if (number == sum)
        return "SIM";
    else
        return "NAO";
    }
}
