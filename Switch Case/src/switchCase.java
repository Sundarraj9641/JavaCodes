import java.util.Scanner;
public class switchCase {
	public static void main(String[] args) {
		System.out.println("Enter Add for Addition \n Sub for Subtbtraction \n Mul for Multiplication");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Enter value for A");
		int a = sc.nextInt();
		
		System.out.println("Enter value for B");
		int b = sc.nextInt();
		
		switch(input) {
		case "Add":
			System.out.printf("Addition of %d and %d is %d",a,b,a+b);
			break;
		case "Sub":
			System.out.printf("Subtraction of %d and %d is %d",a,b,a-b);
			break;
		case "Mul":
			System.out.printf("Multiplication of %d and %d is %d",a,b,a*b);
			break;
		default :
			System.out.println("Please enter the valid data");
		}
		sc.close();
	}

}
