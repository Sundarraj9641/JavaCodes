package demo;


public class program002 {

	public static void main(String[] args) {
	int i, n ,n1=0,n2=1, n3=0;
	System.out.print("enter the number of terms :");

	for(i=0; i<=n; i++) {
		n3=n1+n2;
		System.out.print(n3 + "\t");
		n1=n2;
		n2=n3;
	}
	
	}
}
