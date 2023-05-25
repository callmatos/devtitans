import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			var input = sc.nextInt();
			if (input == -1) break;
			
			if (input % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
		}
		sc.close();
	}
}