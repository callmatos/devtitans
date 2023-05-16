import java.util.Scanner;

public class AproximacaoPi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var iter = sc.nextInt();
		
		sc.close();
		
		if (iter == 1) {
			System.out.println(String.format("%.6f", 3.0));
			return;
		}
		
		var rst = 3.0;
		System.out.println(String.format("%.6f", rst));
		
		for (int i = 1; i < iter; i++) {
			if (i % 2 != 0) {
				rst += 4.0/((2*i) * (2*i+1.0) * (2*i+2.0));
				System.out.println(String.format("%.6f", rst));
				continue;
			}
			
			rst -= 4.0/((2*i) * (2*i+1.0) * (2*i+2.0));
			System.out.println(String.format("%.6f", rst));
		}
		
	}

}
