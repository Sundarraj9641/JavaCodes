
class Cycle{			//class cycle
	void display() {
		System.out.println("I am a cycle");
	}
}
public class Anonymus {
	public static void main(String[] args) {
		Cycle c = new Cycle();		//create object for cycle
		c.display();
		
		Cycle c1 = new Cycle()
		//creating class without a name is called Anonymous class
				{				
			void display() {
				System.out.println("I am a Tricycle");
			}
				};			//it must end with semicolon
		c1.display();		
	}
}
