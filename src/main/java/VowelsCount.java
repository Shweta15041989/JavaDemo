import java.util.Scanner;

public class VowelsCount {

	public static boolean ifVowel(char c) {
		return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||
				c == 'A' || c == 'E' ||c == 'I' ||c == 'O' ||c == 'U';
		
	}
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		String str= sc.next();
		char[] c = str.toCharArray();
		int count = 0;
		
		for (int x = 0; x<c.length; x++) {
			if (ifVowel(str.charAt(x))) {
				count ++;
			}
		} System.out.println(count);
	}
}
