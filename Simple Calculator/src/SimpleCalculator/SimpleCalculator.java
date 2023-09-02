package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {
		public static void main(String []args) {
			
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			Scanner sc = new Scanner(System.in);
			int  input = sc.nextInt();
			System.out.println("Enter the value for A :");
			int a = sc.nextInt();
			System.out.println("Enter the value for B :");
			int b = sc.nextInt();
			
			if (input == 1 || input == 2 || input == 3 || input == 4) {
				switch(input) {
				case 1 :
					System.out.printf("The Addition of %d and %d id %d",a,b,a+b);
					break;
				case 2 :
					System.out.printf("The Subtraction of %d and %d id %d",a,b,a-b);
					break;
				case 3 :
					System.out.printf("The Multiplication of %d and %d id %d",a,b,a*b);
					break;
				case 4 :
					System.out.printf("The Division of %d and %d id %d",a,b,a/b);
					break;
				}
			}
			else {
				System.out.println("Enter the valid input");
			}
			sc.close();
		}

}
