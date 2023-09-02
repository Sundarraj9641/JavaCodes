package Fibanocci;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String []args) {
		System.out.print("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first_number =0;
		int second_number =1;
		int third_number;
		for(int i =1; i<=num; i++) {
			third_number = first_number + second_number;
			System.out.print(first_number + " ");
			first_number=second_number;
			second_number = third_number;
			
		}
		sc.close();
	}
}
