import java.util.Scanner;

public class Media {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	var count = 0.0;
	
	for (int i = 0; i < 3; i++) {
		count += sc.nextDouble();
	}
	
	System.out.println(String.format("%.2f", count/3));
	
	sc.close();
	
}
}