import java.util.Scanner;

public class evenorodd {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the positive integer :");
		n = sc.nextInt();
		
		if(n%2==0) {
			System.out.printf("The number %d is a Even Number",n);
		}else if (n<0) {
			System.out.print("Enter the positive integer");
		}else {
			System.out.printf("The number %d is a Odd Number",n);
		}
		sc.close();
	}

}
