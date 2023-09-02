//create a custom exception which is inherited from Exception class
public class InsufficientBalanceException extends Exception {
	double amt;
	InsufficientBalanceException(double a){  	//constructor
		amt=a;
		System.out.println("your balance is " + amt);
	}
}
