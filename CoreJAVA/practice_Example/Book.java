package study.practiceExample;

public class Book implements Comparable<Book> {
	private String bookname;
	private String auther;
	private double cost;

	public Book(String bookname, String auther, double cost) {

		this.bookname = bookname;
		this.auther = auther;
		this.cost = cost;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		Book temp = (Book) obj;
		if (temp.getBookname().equals(this.bookname) && temp.getAuther().equals(this.auther) && temp.cost == this.cost)
			return true;

		return false;

	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", auther=" + auther + ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(Book o) {
		
		if (this.getCost() > o.getCost())
			return 1;
		else if (this.getCost() < o.getCost())
			return -1;
		else
			return 0;
		
	}

}
