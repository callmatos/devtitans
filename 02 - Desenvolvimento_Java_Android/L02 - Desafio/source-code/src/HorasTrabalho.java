import java.util.ArrayList;
import java.util.Scanner;

public class HorasTrabalho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var hr = new ArrayList<>();

		int input;

		do {

			input = sc.nextInt();

			if (input != -1) {
				hr.add(input);
			}

		} while (input != -1);

		sc.close();

		var count = 0;
		var sunH = 0;

		for (int i = 0; i < hr.size(); i++) {
			sunH += (int) hr.get(i);
			count++;

			if (count == 7) {
				System.out.println(sunH);
				count = 0;
				sunH = 0;
			}
		}

	}

}