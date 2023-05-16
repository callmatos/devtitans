import java.util.ArrayList;
import java.util.Scanner;

public class TimeFutebol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var time = new ArrayList<>();
		var outroTime = new ArrayList<>();

		double input;

		do {

			input = sc.nextDouble();

			if (input != -1) {
				time.add(input);
			}

		} while (input != -1);

		do {
			input = sc.nextDouble();

			if (input != -1) {
				outroTime.add(input);
			}
		} while (input != -1);

		sc.close();

		var vitorias = 0;
		var empates = 0;
		var derrotas = 0;

		for (int i = 0; i < time.size(); i++) {
			if ((double)time.get(i) > (double)outroTime.get(i)) {
				vitorias++;
			}
			
			if ((double)time.get(i) == (double)outroTime.get(i)) {
				empates++;
			}
			
			if ((double)time.get(i) < (double)outroTime.get(i)) {
				derrotas++;
			}
		}

		System.out.println(String.format("%d %d %d", vitorias, empates, derrotas));

	}

}