package inheritance;

public class Employee implements IEmployee{
	private String id, name, address, department;
	
	public Employee(String id, String name, String address, String department) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getDepartment() {
		return department;
	}
	public int computeSalary() {
		return 0;
	}
}
