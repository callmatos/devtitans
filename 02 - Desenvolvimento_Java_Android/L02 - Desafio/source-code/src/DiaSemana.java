import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var horas = new ArrayList<>();

		int input;

		do {

			input = sc.nextInt();

			if (input != -1) {
				horas.add(input);
			}

		} while (input != -1);

		sc.close();

		var dias = new int[] { 0, 0, 0, 0, 0, 0, 0 };

		var count = 0;

		for (int i = 0; i < horas.size(); i++) {
			dias[count] += (int) horas.get(i);

			count++;

			if (count == 7) {
				count = 0;
			}
		}

		var max = Arrays.stream(dias).max().getAsInt();

		for (int i = 0; i < dias.length; i++) {
			if (dias[i] == max) {
				System.out.println(i + 1);
			}
		}

//		System.out.println(max);

	}

}