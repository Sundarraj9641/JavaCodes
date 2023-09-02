package Tables;

import java.util.Scanner;

public class MnultiplicationTable {
		public static void main( String []args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter which table would you want , eg:1 or 2 or 3......etc");
			int tb = sc.nextInt();
			if (tb>0) {
				System.out.println("Enter the number of steps would you want");
				int ln = sc.nextInt();
				for(int i=1; i<=ln; i++) {
					System.out.printf("%d X %d = %d",i,tb, i*tb);
					System.out.println();
				}
			}else {
				System.out.println("Enter the vaild number");
			}
			sc.close();
		}

}
