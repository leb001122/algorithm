package inheritance;

public class Book {
	private String bname, author;
	private int page;
	
	public Book(String bn, int pa, String au) {
		this.bname = bname;
		this.page = page;
		this.author = author;
	}
	
	public void setBname(String bn) {
		bname = bn;
	}
	public void setPage(int pa) {
		page = pa;
	}
	public void setAuthor(String au) {
		author = au;
	}
	public String getBname() {
		return bname;
	}
	public int getPage() {
		return page;
	}
	public String getAuthor() {
		return author;
	}
}
