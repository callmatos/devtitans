import java.util.Scanner;

public class AproximacaoSeno {
	
	public static long factor(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    return n * factor(n - 1);
	}

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		var ang = Math.toRadians(scann.nextDouble());
		var iter = scann.nextInt();
		
		scann.close();
		
		if (iter == 1) {
			System.out.println(String.format("%.10f", ang));
			return;
		}
		
		var result = ang;
		System.out.println(String.format("%.10f", result));
		
		for (int i = 1; i < iter; i++) {
			if (i % 2 != 0) {
				result -= Math.pow(ang, (2*i) + 1) / factor((2*i) + 1);
				System.out.println(String.format("%.10f", result));
				continue;
			}
			
			result += Math.pow(ang, (2*i) + 1) / factor((2*i) + 1);
			System.out.println(String.format("%.10f", result));
		}

	}

}
