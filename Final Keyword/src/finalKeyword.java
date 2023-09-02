/*final class a {
	 final void Print(){
		System.out.println("print from class a");
	}
}

class b extends a{
	
}*/

public class finalKeyword {
	
	static double Area(double r, double PI){   //method to find area
		return r*PI*PI;
	}
	public static void main(String[] args) {
		final double PI = 3.14;     //the value of PI is declared as final, so it's not allowed to change
		
		System.out.println(Area(3,PI));
		
		
		
		/*
		if we try to change the value of PI
		PI = 4.44;
		it throw a error
		
		
		  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final local variable PI cannot be assigned. It must be blank and not using a compound assignment

	at finalKeyword.main(finalKeyword.java:14)
		 */
	}
	

}
