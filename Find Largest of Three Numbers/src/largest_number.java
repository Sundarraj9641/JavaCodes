import java.util.Scanner;

public class largest_number {
	
	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number :");
		a=sc.nextInt();
		
		System.out.print("Enter the second number :");
		b=sc.nextInt();
		
		System.out.print("Enter the third number :");
		c=sc.nextInt();
		
		if (a>=b && a>=c) {
			System.out.printf("The Number %d is a Largest Number", a);
		}else if(b>=c && b>=a) {
			System.out.printf("The Number %d is a Largest Number", b);
		}else {
			System.out.printf("The Number %d is a Largest Number",c);
		}
		sc.close();
	}

}
