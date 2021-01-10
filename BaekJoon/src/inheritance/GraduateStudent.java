package inheritance;

public class GraduateStudent extends Student{

	private String major;
	
	public GraduateStudent(String id, int gr, String pr, String ma) {
		super(id, gr, pr);
		major = ma;
	}
	
	public void setMajor(String ma) {
		major = ma;
	}
	public String getMajor() {
		return major;
	}
}
