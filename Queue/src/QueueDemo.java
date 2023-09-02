import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<Integer>();		//Queue declaration
		
		q.add(3);			//adding elements to the queue
		q.add(5);
		q.add(8);
		q.add(10);
		q.add(15);
		
		System.out.println("Queue Before remove");
		System.out.println(q);
		
		q.remove();		//remove element in the queue
		
		System.out.println("Queue After remove");
		System.out.println(q);
		
	}

}
