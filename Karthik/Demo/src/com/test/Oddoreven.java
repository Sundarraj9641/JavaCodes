package com.test;
import java.util.Scanner;

public class Oddoreven {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			if (num%4==0) {
				System.out.println("LEAP YEAR");
			}else {
				System.out.println("NOT A LEAP YEAR");
			}
		}else {
			System.out.println("INVALID");
		}

		sc.close();
		
		
}
}
