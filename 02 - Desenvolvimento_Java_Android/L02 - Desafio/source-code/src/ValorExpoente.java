import java.util.Scanner;

public class ValorExpoente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var number = sc.nextInt();
		
		sc.close();
		
		var sum  = 2;
		var count = 1;
		
		if (number == 1) {
			System.out.println(count);
			return;
		}
		
		do {
			sum += Math.pow(2, ++count);
		}
		while (sum <= number);
			
		
		
		System.out.println(count);

	}

}