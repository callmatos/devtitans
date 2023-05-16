import java.util.ArrayList;
import java.util.Scanner;

public class FaltasTrabalho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var fals = new ArrayList<>();

		int input;

		do {

			input = sc.nextInt();

			if (input != -1) {
				fals.add(input);
			}

		} while (input != -1);

		sc.close();

		var seg = 0.0;
		var ter = 0.0;
		var qua = 0.0;
		var qui = 0.0;
		var sex = 0.0;
		var sab = 0.0;

		for (int i = 0; i < fals.size(); i++) {
			if ((int) fals.get(i) == 2) {
				seg++;
				continue;
			}

			if ((int) fals.get(i) == 3) {
				ter++;
				continue;
			}

			if ((int) fals.get(i) == 4) {
				qua++;
				continue;
			}

			if ((int) fals.get(i) == 5) {
				qui++;
				continue;
			}

			if ((int) fals.get(i) == 6) {
				sex++;
				continue;
			}

			if ((int) fals.get(i) == 7) {
				sab++;
				continue;
			}
		}

		System.out.println(String.format("%.1f %.1f %.1f %.1f %.1f %.1f", seg / fals.size() * 100,
				ter / fals.size() * 100, qua / fals.size() * 100, qui / fals.size() * 100,
				sex / fals.size() * 100, sab / fals.size() * 100));

	}

}