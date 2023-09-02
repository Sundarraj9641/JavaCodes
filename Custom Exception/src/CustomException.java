
public class CustomException {
	public static void main(String[] args) {
		double bal = 1000;
		double wdl=1002;
		try {			//try block
		if(wdl>bal) {
			throw new InsufficientBalanceException(bal);  //throw a exception
		}
		}
		
		//catch the exception
		catch (InsufficientBalanceException e) {
			System.out.println("Not Enough Money to withdraw");
			
		}
	}

}
