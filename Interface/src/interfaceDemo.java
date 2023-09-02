interface one{
	void show();
	void config();
}

interface two{
	void run();
}

		//multiple inheritance is achieved by interface
class B implements one,two{
	public void show(){
		System.out.println("In Show");
	}
	public void config(){
		System.out.println("In config");
	}
	public void run(){
		System.out.println("In run");
	}
}

public class interfaceDemo {
	public static void main(String[] args) {
		one o = new B();
		two t = new B();
		o.config();
		o.show();
		t.run();
		
	}

}
