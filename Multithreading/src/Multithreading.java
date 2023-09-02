//class implements from the Runnable interface is the way to achieve a multithreading
class Update implements Runnable{		//interface for multithreading
	
	//start() is only execute the run() in the class
	//so the method is renamed as run()
	public void run() {
		for(int i =0; i<=5; i++ ) {
			System.out.println("Updating!!!");
			try {
				Thread.sleep(4000);   //delay the execution by 4 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Delete{
	void deleting() {
		for(int i =0; i<=5; i++ ) {
			System.out.println("Deleting!!!");
		}
	}
	
}
public class Multithreading {
	public static void main(String[] args) {		//thread
		
		//we don't create object for interface
		//so create a object for class "Update" with the reference of interface "Runnable"
		Runnable r = new Update();     
		Delete d = new Delete();	//object for class Delete
		
		Thread t = new Thread(r);		//object for Thread with object of interface r as a parameter
		
		t.start(); //start() is searching for run() in the class   
		
		//this statement is waited until the above statement is executed completely
		d.deleting();	//now this statement is not waiting for the execution of previous statement
	
		//both u.start() and d.deleting() is executed simultaneously
	}
}
