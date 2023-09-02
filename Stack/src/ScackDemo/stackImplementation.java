package ScackDemo;

public class stackImplementation {
	public static void main(String[] args) {
		
		stack s1 = new stack();		//creating object for stack class
		
		s1.push(2);     //push element in the stack
		s1.push(5);
		s1.push(7);
		s1.push(9);
		s1.push(4);
		s1.push(15);
		s1.push(74);
		s1.push(95);
		s1.push(44);
		s1.push(33);
		System.out.println(s1.pop());    //pop element in the stack
		System.out.println(s1.pop());
		
	}
	
}
