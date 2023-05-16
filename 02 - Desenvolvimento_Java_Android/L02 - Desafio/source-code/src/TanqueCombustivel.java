import java.util.Scanner;

public class TanqueCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var r = sc.nextDouble();
		var x = sc.nextDouble();
		var option = sc.nextInt();
		sc.close();
		
		var v = (4.0/3) * Math.PI * Math.pow(r, 3);
		var c = (Math.PI/3.0) * Math.pow(x, 2) * (3*r - x);
		
		if (option == 1) {
			System.out.println(String.format("%.4f", c));
		}
		
		if (option == 2) {
			System.out.println(String.format("%.4f", v - c));
		}

	}

}