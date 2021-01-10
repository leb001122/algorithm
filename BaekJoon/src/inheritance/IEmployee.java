package inheritance;

public interface IEmployee {
	public void setId(String id);
	public void setName(String name);
	public void setAddress(String address);
	public void setDepartment(String department);
	public String getId();
	public String getName();
	public String getAddress();
	public String getDepartment();
	public int computeSalary();
}
