import java.util.Scanner;

public class Compound_Interest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double p, r, n,c;
		
		System.out.print(" Enter the Principle Amount :");
		p = sc.nextDouble();
		
		System.out.print(" Enter the Rate of Interest :");
		r = sc.nextDouble();
		
		System.out.print(" Enter the Number of Years :");
		n = sc.nextDouble();
		sc.close();
		
		c = p*(Math.pow((1+r/100), n))-p;
		
		System.out.print(" The Compound Interest is :" +c);
	}
	

}
