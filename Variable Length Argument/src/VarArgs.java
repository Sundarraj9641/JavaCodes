
public class VarArgs {
	
	static int MinOfNum(int...num) {    // int ...  >> indicates the variable length arguments
		int min=Integer.MAX_VALUE;      //set maximum value to the min
		for(int k:num) {
			if(k<min) {
				min=k;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int m = MinOfNum(100,3,5,2,6,8,99);
		System.out.println(m);
		
	}

}
