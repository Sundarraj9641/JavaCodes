package GetterSetter;


public class AccountHolder {
	private int Balance;
	private String Name;
	private int MobileNo;

		
	
	public void Details(int Balance, String Name, int MobileNo) {
		this.Balance = Balance;
		this.Name = Name;
		this.MobileNo=MobileNo;

}
	public int getBalance() {
		return this.Balance;
	}
	public void setBalance (int Balance) {
		this.Balance = Balance;
	}
	public String getName() {
		return this.Name;
	}
	public void setName (String Name) {
		this.Name = Name;
	}
	public int getMobileNo() {
		return this.MobileNo;
	}
	public void setMobileNo (int MobileNo) {
		this.MobileNo = MobileNo;
	}
	public String toString() {
		String str = "Balance :"+Balance +"\n"+ "Name :"+ Name + "\n" + "Mobile : "+ MobileNo;
		return str;
	}
}