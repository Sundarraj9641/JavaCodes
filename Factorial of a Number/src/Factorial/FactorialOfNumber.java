package Factorial;
import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String [] args) {
		int fact =1;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
		for(int i=1; i<=num; i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
	
	else {
		System.out.println("Enter the number Greater then Zero");
	}
		sc.close();
}
}