import java.util.Scanner;

public class AngryBirds {
	public static int AlcanceMaximo(double v0, double alfa, double D) {
		
		double num = Math.pow(Math.abs(v0), 2.0) * Math.sin(2 * alfa);
		double den = 9.8;
		
		double R = num/den;
		
		//System.out.println(R);
		
		if (R < D && (D - R) <= 0.1) {
			return 1;
		} else if (R > D && R - D <= 0.1) {
			return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		double v0 = sc.nextDouble();
		double alfa = Math.toRadians(sc.nextDouble());
		double D = sc.nextDouble();
		
		System.out.println(AlcanceMaximo(v0, alfa, D));
		
		sc.close();
	}
}
