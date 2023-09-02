import java.util.Scanner;

public class sumofNaturalNumbers {
	
	public static void main(String[] args) {
		
		int n,i,sum=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Number of Terms :");
			n = sc.nextInt();
		}
		if (n>=0) {
		
		for(i=0; i<=n; i++) {
			sum+=i;
		}
		System.out.printf("The sum of %d terms of Natural Number is : %d",n,sum);
	} else {
		System.out.print("Enter the valid positive terms");
	}
	}
}
