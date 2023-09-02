import java.util.Scanner;

public class quotientandremainder {
public static void main(String[] args) {
	int q, r, divident,divisor;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the divident :");
	divident = sc.nextInt();
	
	System.out.print("Enter the divisor :");
	divisor = sc.nextInt();
	
	q = divident/divisor;
	r = divident%divisor;
	
	System.out.printf("The Quotient of %d and %d is : %d \n", divident, divisor, q );
	System.out.printf("The Remainder of %d and %d is : %d ", divident, divisor, r);
	sc.close();
}
}
