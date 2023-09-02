

class employee{			//class Employee
	
	//instance variables
	private String name;
	private double salary;
	
	employee(String name, double salary){		//constructor
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {			//getter
		return salary;
	}
	void setsalary(double salary) {		//setter
		this.salary = salary;
	}
	
	String getName() {		
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	//method to give the bonus
	double SalaryRise(int percent) {  //argument to get the percentage of salary rise
		return salary+=salary*percent/100;
	}
}

class manager extends employee{     //manager extends from employee
	// bonus us the only special thing that present in the manager class 
	double bonus;
	
	//creating constructor include both instance variables in class "employee" and "manager"
	manager(String name, double salary, double bonus){
		
		// "super(name,salary)" is used to assess the instance variables in base class "employee"
		super(name,salary);
		this.bonus = bonus;
	}
	double getBonus(){
		return bonus;
	}
	
	// for getting the bonus added salary for manager object
	public double getSalary() {			//method overriding
		
		//super.getSalary is used to asses the salary method in super class
		return super.getSalary()+bonus;
	}
}
public class inheritance {			
	public static void main(String[] args) {			//main method
		
		//creating object for employee
		employee e1 = new employee("raj", 25000);
		
		//set bonus for employee 
		e1.SalaryRise(20);			
		
		//get bonus added salary for employee
		System.out.println("Name: " + e1.getName() + "-->Salary: " + e1.getSalary());				
		
		//creating object for manager
		manager m1 = new manager("sundar", 25000, 250.0);		
		
		System.out.println("Name:" + m1.getName() + "-->Salary :" + m1.getSalary());				//get salary for manager
	}
}
