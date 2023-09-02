package com.sundarraj;
import java.util.Scanner;

public class program002 {
	public static void main(String[] args) {
		while(true) {
		int a, b, savings, extrapercent,extrasave, totalsaving;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Enter your salary :");
		a = sc.nextInt();
		
	
			if (a<8000 && a>0) {
		System.out.print("Enter your shift :");
		b = sc.nextInt();
		
		if (b<5) {
			System.out.println("Shift is too small ");
		break;}
		savings = a/2;
		extrapercent = b*2;
		extrasave = a/extrapercent;
		totalsaving = savings + extrasave;
		sc.close();
		
		System.out.printf("The Savings is :" + totalsaving);
		}
		else if (a>8000) {
			System.out.println("Salary is too large ");
		} 
		}
	
	}
	}

