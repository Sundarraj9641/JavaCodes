package SwappingOfNumber;

import java.util.Scanner;

public class SwapWithoutTemporaryVariable {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int a= sc.nextInt();
		System.out.println("Enter the value of B : ");
		int b= sc.nextInt();
		System.out.printf("The values of A and B before Swapping, A = %d and B = %d",a,b);
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println();
		System.out.printf("The values of A and B after Swapping, A = %d and B = %d",a,b);
		sc.close();
	}

}
