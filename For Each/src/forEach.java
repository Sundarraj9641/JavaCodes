import java.util.Arrays;
import java.util.Scanner;
public class forEach {
	public static void main(String[] args) {
		System.out.println("enter the element for array of 5 elements");
		Scanner sc= new Scanner(System.in);
		int e = sc.nextInt();
		int []a = new int[e];
		for(int i =0; i<=e; i++ ) {
			
			a[i]= sc.nextInt();
			
		}
		for(int arr:a) {
			System.out.println(arr);
		}
		sc.close();
	}
}
