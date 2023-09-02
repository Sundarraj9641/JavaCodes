package sundarraj;
import java.util.Scanner;


public class Program001 {
	
	public static void main(String[] args) {
		
		int n, a, b; 
		int c =0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n");
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		n = sc.nextInt();
		
		
		
		
		
		if (n==1 || n==2 || n==3 || n==4) {
			
			System.out.println("enter the value for a :");
			a = sc.nextInt();
			
			System.out.println("enter the value for b :");
			b = sc.nextInt();
			
		switch(n) {
		case 1:
			c= a+b;
			System.out.printf("the addition of %d and %d is : %d \n", a, b, c);
			break;
			
		case 2:
			c= a-b;
			System.out.printf("the subtraction of %d and %d is : %d \n", a, b, c);
			break;
			
		case 3:
			c= a*b;
			System.out.printf("the multiplication of %d and %d is : %d \n", a, b, c);
			break;
			
		case 4:
			c= a/b;
			System.out.printf("the division of %d and %d is : %d \n", a, b, c);
			break;
			
				
		}
	
	} else {
		System.out.println(" Please enter the valid input");
		
	}
	sc.close();
}

}
}