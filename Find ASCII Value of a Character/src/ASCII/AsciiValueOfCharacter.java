package ASCII;
import java.util.Scanner;
public class AsciiValueOfCharacter {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character Between A and Z");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z') ) {
			System.out.println((int)ch);
		} else {
			System.out.println("Enter the Valid Input");
		}
		sc.close();
	}
}
