import java.util.Scanner;
import java.util.StringJoiner;

public class Run {

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();
//	char operation = sc.next().charAt(0);
	int num[] = {1,2,4,5,6};
	int n = num.length+1;
	//System.out.println("n" + n);
	String str = "Shweta Suresh Hadpad";
	char c='h';
	//String c[]=str.split("");
	//System.out.println("Shweta" + str.lastIndexOf(""));

	System.out.println(CharOccurence.getCountofchar(str,c));
	//System.out.println();
}
	
	public static void natural(String str) {

	System.out.println(str.chars().filter(e -> (char)e=='H').count());

	}}

	
	
