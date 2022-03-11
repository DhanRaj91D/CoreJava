
public class Book {

	private int bookID;
	private String bookName;
	private int price;
	private int qty;

	public Book(int bookID, String bookName, int price, int qty) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.price = price;
		this.qty = qty;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		String str = "";

		str = str + "Book ID: " + bookID + "\nBook Name: " + bookName + "\nPrice: " + price + "\nQty: " + qty;

		return str;

	}

}
