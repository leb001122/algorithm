package inheritance;

public class Student {
	private String id;
	private int grade;
	private String professor;
	
	public Student(String id, int gr, String pr) {
		this.id = id;
		grade = gr;
		professor = pr;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setGrade(int gr) {
		grade = gr;
	}
	public void setProfessor(String pr) {
		professor = pr;
	} 
	public String getId() {
		return id;
	}
	public int getGrade() {
		return grade;
	}
	public String getProfessor() {
		return professor;
	}
	
}
