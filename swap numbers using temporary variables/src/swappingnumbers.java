import java.util.Scanner;

public class swappingnumbers {
	
	public static void main(String[] args) {
		int a, b, t;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value for A :");
		a = sc.nextInt();
		
		System.out.print("Enter the value for B :");
		b = sc.nextInt();
		
		t=a;
		a=b;
		b=t;
		sc.close();
		System.out.printf("After Swapping A = %d, B = %d",a,b);
	}

}
