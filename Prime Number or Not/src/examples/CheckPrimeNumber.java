package examples;

public class CheckPrimeNumber {
	public static void main ( String [] args) {
		int num =25;
		boolean prime = false;
		for(int i = 2; i<=num/2; i++) {
			if(num%i == 0) {
				prime = true;
				break;
			}
		}
			if(!prime) {
				System.out.println("it is a prime number");
			} else {
				System.out.println("it is Not a prime number");
			}
	}
}
