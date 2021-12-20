package study.hasarelation;

/*2.  Write a class Book - 
Properties - bookname, cost, String[] authors 
Write 2 constructors , getters and setters 
In the UserOfBook class  - create array few books 
1. Show all books having single author
2. Show all books -  bookname and cost
3. Show total cost of all books In the array
4. Show only bookname  author1,author2, author…………   for all books*/
import java.util.Arrays;

public class Book {
	private String bookname;
	private int cost;
	private String[] authors;

	public Book() {
		bookname = "Mahabharat";
		cost = 500;
		authors = new String[2];

	}

	public Book(String bookname, int cost, String[] authors) {
		this.bookname = bookname;
		this.cost = cost;
		this.authors = authors;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Book) {
			Book temp = (Book) obj;
			boolean aut = true;
			if (!(this.authors.length == temp.authors.length)) {
				aut = false;

			} else {
				for (int i = 0; i < authors.length; i++) {
					if (!(this.authors[i].equals(temp.authors[i])))
						aut = false;
				}
			}

			if (this.bookname.equals(temp.bookname) && this.cost == temp.cost && aut) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "";
		str += "Book [bookname=" + bookname + ", cost=" + cost + ", authors=" + Arrays.toString(authors) + "]";
		return str;
	}

}
