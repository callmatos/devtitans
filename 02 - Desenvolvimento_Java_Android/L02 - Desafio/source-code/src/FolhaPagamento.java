import java.text.DecimalFormat;
import java.util.Scanner;

public class FolhaPagamento {
    
    public static void main(String[] args) {
        

        DecimalFormat df = new DecimalFormat("#.00");
        
        Scanner in = new Scanner(System.in);

        double vHora = in.nextDouble();
        int tHoras = in.nextInt();

        double salarioBruto = salarioBruto(vHora, tHoras);
        double ir = iR(salarioBruto(vHora, tHoras));
        double inss = iNSS(salarioBruto);

        System.out.println("Salario bruto: R$"+df.format(salarioBruto));
        System.out.println("IR: R$"+df.format(ir));
        System.out.println("INSS: R$"+df.format(inss));
        System.out.println("Total de descontos: R$"+df.format((ir + inss)));
        System.out.println("Salario liquido: R$"+df.format((salarioBruto - (ir + inss))));

    }

    public static double salarioBruto(double vHora, int tHoras){
        return vHora * tHoras;
    }

    public static double iR(double salario){
        return (salario * 0.11);
    }

    public static double iNSS(double salario){
        return (salario * 0.08);
    }

    public static double tDesconto(double ir, double inss){
        return ir + inss;
    }



}
