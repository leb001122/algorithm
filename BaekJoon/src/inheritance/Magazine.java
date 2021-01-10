package inheritance;

public class Magazine extends Book{
	private String date;
	
	public Magazine(String bn, int pa, String au, String da) {
		super(bn, pa, au);
		this.date = da;
	}
	public void setDate(String d) {
		date = d;
	}
	public String getDate() {
		return date;
	}
}
