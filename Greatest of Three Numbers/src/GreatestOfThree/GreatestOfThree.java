package GreatestOfThree;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for A : ");
		int a = sc.nextInt();
		System.out.println("Enter the value for B : ");
		int b = sc.nextInt();
		System.out.println("Enter the value for C : ");
		int c = sc.nextInt();
		if(a>=b && a>=c) {
			System.out.printf("%d is the Greatest among all ",a);
		}else if (b>=a && b>=c) {
			System.out.printf("%d is the Greatest among all ",b);
		} else {
			System.out.printf("%d is the Greatest among all ",c);
		}
		sc.close();
	}
}
