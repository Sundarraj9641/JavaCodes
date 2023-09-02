
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b=0;
		int c=0;
		try {			//Try block to try the code which may causes an error
		int arr[]=null;
		c = a/b;
		System.out.println(arr[1]);
		
		
		}

		//to catch the arithmetic or Null pointer Exception
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){		//catch block to catch the thrown exception
			System.out.println("Something went wrong!!!");
		}

		System.out.println(c);
		System.out.println("Thank You!!!!");
	}
}
