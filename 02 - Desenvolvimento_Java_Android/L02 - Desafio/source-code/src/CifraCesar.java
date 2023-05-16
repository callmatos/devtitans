import java.util.Scanner;

public class CifraCesar {
	
	static String _ALPH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String shiftLet(String character, int positions) {
		 if (!_ALPH.contains(character)) {
			 return character;
		 }
		 
		 var currInde = _ALPH.indexOf(character);
		 var shiftedIndex = currInde;
		 
		 if (currInde+positions > _ALPH.length()-1) {
			 shiftedIndex = positions - ((_ALPH.length() - 1) - currInde) - 1;
			 return String.valueOf(_ALPH.charAt(shiftedIndex));
		 }
		 
		return String.valueOf(_ALPH.charAt(currInde + positions));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var positions = sc.nextInt();
		var text = sc.nextLine().toUpperCase().trim();

		sc.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			sb.append(shiftLet(String.valueOf(text.charAt(i)), positions));
		}
		
		System.out.println(sb.toString());
	}

}