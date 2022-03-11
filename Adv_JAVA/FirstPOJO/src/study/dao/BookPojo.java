package study.dao;

public class BookPojo {

	private int bookid, bookcost;
	private String bookname;
	public BookPojo() {
		
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getBookcost() {
		return bookcost;
	}
	public void setBookcost(int bookcost) {
		this.bookcost = bookcost;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "BookPojo [bookid=" + bookid + ", bookcost=" + bookcost + ", bookname=" + bookname + "]";
	}
	
	
	
}
