import java.util.Scanner;

public class OperacoesString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var text = sc.nextLine();

		sc.close();
		
		System.out.println(text.length());
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(text.length()-1));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.replaceAll("a", "e"));
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			if (i%2 == 0) {
				sb.append(text.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		
		var vog = "aAeEiIoOu";
		var count = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (vog.contains(String.valueOf(text.charAt(i)))) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}