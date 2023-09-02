package methods;

public class employee {
	private int employeeId;
	private String Name;
	private String dept;
	private String location;
	
	public void employees(int employeeId, String Name, String dept, String location) {
		this.employeeId = employeeId;
		this.Name = Name;
		this.dept = dept;
		this.location = location;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", Name=" + Name + ", dept=" + dept + ", location=" + location
				+ "]";
	}
	

}
