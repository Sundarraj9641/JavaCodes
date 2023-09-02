package LeapYear;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid year");
		int year = sc.nextInt();
		if(String.valueOf(year).length() == 4) {
			if(year%4==0) {
				System.out.println("Leap year");
			}else {
				System.out.println("Not a Leap Year");
			}
		}else {
			System.out.println("Enter the valid year");
		}
		sc.close();
	}

}
