

abstract class members{          //Abstract class must contain at least one Abstract method
	 String name;
	
	//Abstract method must be without arguments and the block "{}"
	//Method can be given in the derived class
	abstract void Getmessage();	

}

class students extends members{		//Student class inherited from members class
	
	//Method block is given to the abstract method declared in the base class
	void Getmessage() {
		System.out.println("hello Student!!!");

	}
}
class teachers extends members{		//Teachers class inherited from members class
	
	//Method block is given to the abstract method declared in the base class
	void Getmessage() {
		System.out.println("hello Teacher!!!");
	}

}
public class abstractDemo {
	public static void main(String[] args) {
		students s1 = new students();		//creating object for students class
		s1.Getmessage();
		
		teachers t1 = new teachers();		//creating object for teachers class
		t1.Getmessage();
		
		members m1 = new teachers();		//creating object for member class
		m1.Getmessage();
		
		members []member = new members[5];  //creating array of object for Members class
		member[0] = new students();
		member[1] = new students();
		member[2] = new teachers();
		member[3] = new students();
		member[4] = new teachers();
		
		
		for(members m : member) {
			m.Getmessage();
		
		}
	}
}
