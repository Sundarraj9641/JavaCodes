package GetterSetter;

public class bank {
	public static void main (String []args) {
		AccountHolder Ac = new AccountHolder();
		Ac.setBalance(1000);
		Ac.setName("Raj");
		Ac.setMobileNo(1236547890);
		
		System.out.println(Ac.toString());
	}

}
