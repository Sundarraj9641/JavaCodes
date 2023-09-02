


public class Source {
		static int Check(int a, int b){   //method
			return a>b?a:b;
		}
		
		static double Check(double a, double b) {  //method overloading
			return a>b?a:b;
		}
	public static void main(String[] args) {
			System.out.println(Check(5,2));
			System.out.println(Check(9.33,12.44));
	
	}
}

