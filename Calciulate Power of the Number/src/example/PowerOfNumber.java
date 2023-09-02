package example;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main ( String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Value :");
		int base = sc.nextInt();
		System.out.println("Enter the Power Value :");
		int power = sc.nextInt();
		int num = 1;
			for(int i= 1; i<=power;i++ ) {
				num*=base;
			}
			System.out.println(num);
			sc.close();
		} 

}
