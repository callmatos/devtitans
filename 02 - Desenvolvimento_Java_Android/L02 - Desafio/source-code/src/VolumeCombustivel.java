import java.util.Scanner;

public class VolumeCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var H = sc.nextDouble();
		var h = sc.nextDouble();
		var r = sc.nextDouble();
		sc.close();
		
		if (h > H || H <= 0 || r <= 0) {
			System.out.println(String.format("%.3f", -1.0));
			return;
		}
		
		if (h == 0) {
			System.out.println(String.format("%.3f", 0));
			return;
		}	

		var totalVolume = ((4.0 / 3) * Math.PI * Math.pow(r, 3)) + (Math.PI * Math.pow(r, 2) * (H - (2 * r)));

		if (h == H) {
			System.out.println(String.format("%.3f", totalVolume));
			return;
		}

		if (h > (H - r)) {
			var volumeParcial = totalVolume - ((Math.PI / 3.0) * Math.pow(H - r, 2) * (3 * r - (H - r)));
			System.out.println(String.format("%.3f", volumeParcial));
			return;
		}
		
		if (h <= (H - r) && h > r) {
			var volumeParcial = (((4.0/3) * Math.PI * Math.pow(r, 3))/2) + (Math.PI * Math.pow(r, 2) * (h - r));
			System.out.println(String.format("%.3f", volumeParcial));
			return;
		}
		
		if (h == r) {
			var volumeParcial = (((4.0/3) * Math.PI * Math.pow(r, 3))/2);
			System.out.println(String.format("%.3f", volumeParcial));
			return;
		}

		if (h < r) {
			var volumeParcial = ((Math.PI / 3.0) * Math.pow(h, 2) * ((3 * r) - h));
			System.out.println(String.format("%.3f", volumeParcial));
			return;
		}
		
		System.out.println(String.format("%.3f", -1.0));
	}

}
