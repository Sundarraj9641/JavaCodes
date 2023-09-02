package examples;

public class PrimeNumberBetweenLimits {
	public static void main ( String [] args) {
		int low = 10, high = 50;
		while (low<high) {
		boolean prime = false;
			for(int i = 2; i<=low/2; ++i) {
				if(low % i == 0) {
				prime = true;
				break;
				}
			}
			if(!prime && low !=0 && low !=1) {
				System.out.println(low);
				++low;
			} 
		}
	}

}
