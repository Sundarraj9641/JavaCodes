package ScackDemo;

public class stack {
	int tos;
	int []s =new int[10];
	stack(){		//constructor
		 tos = -1;  //set tos = -1 for indicating there is no element in stack
	}
	void push(int add) {     //push method
		if(tos==9) {         //tos == 9 indicates stack is full
			System.out.println("Stack is full");
		} else {
		// tos = -1
		s[++tos]=add;        //increment the tos before adding value in the stack 
		// tos = 0
		}
	}
	int pop() {				//pop method
		if(tos>=0) {    	//to check stack is not empty
		return s[tos--];	//return the last element in the stack and decrement the tos
		} else {
			System.out.println("Stack is empty");  // if tos = -1
			return -1;
		}
	}
}
