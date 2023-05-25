import java.util.Scanner;

public class RaizDois {

	public static double recSqrt(int iterations) {
		if (iterations == 0) {
			return 1.0;
		}
		return 1.0 / (2.0 + recSqrt(--iterations));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var iterations = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i <= iterations; i++) {
			System.out.println(String.format("%.14f", 1.0 + recSqrt(i)));
		}
		
		

	}

}