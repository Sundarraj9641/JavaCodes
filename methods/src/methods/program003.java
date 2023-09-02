package methods;

public class program003 {
	public static void main(String []args) {
		employee em = new employee();
		em.setEmployeeId(1001);
		em.setName("Raj");
		em.setDept("EEE");
		em.setLocation("Karur");
		System.out.println(em.toString());
		em.setEmployeeId(1002);
		em.setName("Saran");
		em.setDept("ECE");
		em.setLocation("Namakkal");
		System.out.println(em.toString());
		em.setEmployeeId(1003);
		em.setName("Krithik");
		em.setDept("Mech");
		em.setLocation("Trichy");
		System.out.println(em.toString());
		em.setEmployeeId(1004);
		em.setName("Karthik");
		em.setDept("Civil");
		em.setLocation("Karur");
		
		System.out.println(em.toString());
	}

}
