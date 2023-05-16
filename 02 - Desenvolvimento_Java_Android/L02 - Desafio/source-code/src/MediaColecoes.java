import java.util.ArrayList;
import java.util.Scanner;

public class MediaColecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double input;

		var collect = new ArrayList<>();
		var sum = 0.0;
		var run = true;

		do {
			input = sc.nextDouble();

			if (input != -1.0) {
				collect.add(input);
				sum += input;

			} else {
				if (collect.size() == 0) {
					run = !run;
					continue;
				}
				System.out.println(String.format("%.2f", sum / collect.size()));
				sum = 0;
				collect = new ArrayList<>();
			}

		} while (run);

		sc.close();

	}

}