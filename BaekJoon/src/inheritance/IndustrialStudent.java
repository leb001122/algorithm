package inheritance;

public class IndustrialStudent extends Student implements IEmployee {
	private Employee E;
	
	public IndustrialStudent(String id, String name, int gr, String pr, String address, String department) {
		super(id, gr, pr);
		E = new Employee(id, name, address, department);
	}

	@Override
	public void setId(String id) {
		E.setId(id);
	}
	@Override
	public void setName(String name) {	
		E.setName(name);
	}
	@Override
	public void setAddress(String address) {
		E.setAddress(address);	
	}
	@Override
	public void setDepartment(String department) {
		E.setDepartment(department);	
	}
	@Override
	public String getId() {
		return E.getId();
	}
	@Override
	public String getName() {
		return E.getName();
	}
	@Override
	public String getAddress() {
		return E.getAddress();
	}
	@Override
	public String getDepartment() {
		return E.getDepartment();
	}
	@Override
	public int computeSalary() {
		return E.computeSalary();
	}
}
