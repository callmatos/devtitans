import java.util.ArrayList;
import java.util.Scanner;

public class DistanciaAviao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var cidades = new ArrayList<>();

		int input;

		do {

			input = sc.nextInt();

			if (input != -1) {
				
				if (input == 111) {
					cidades.add(0);
				}
				if (input == 222) {
					cidades.add(1);
				}
				if (input == 333) {
					cidades.add(2);
				}
				if (input == 444) {
					cidades.add(3);
				}
				if (input == 555) {
					cidades.add(4);
				}
				if (input == 666) {
					cidades.add(5);
				}
				if (input == 777) {
					cidades.add(6);
				}
				
			}

		} while (input != -1);

		sc.close();

		var dMap = new int[][] { { 0, 2, 11, 6, 15, 11, 1 }, { 2, 0, 7, 12, 4, 2, 15 }, { 11, 7, 0, 11, 8, 3, 13 },
				{ 6, 12, 11, 0, 10, 2, 1 }, { 15, 4, 8, 10, 0, 5, 13 }, { 11, 2, 3, 2, 5, 0, 14 },
				{ 1, 15, 13, 1, 13, 14, 0 } };
				
		var distance  = 0;
		
		for (int i = 1; i < cidades.size(); i++) {
			distance += dMap[(int)cidades.get(i-1)][(int)cidades.get(i)];			
		}
		
		System.out.println(distance);

	}

}