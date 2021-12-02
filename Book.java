package BookExapmle;

import java.io.Serializable;

public class Book implements Serializable,Comparable<Book> {
	private String bookName;
	private double bookCost;
	private String authorName;

	public Book() {

	}

	public Book(String bookName, double bookCost) {

		this.bookName = bookName;
		this.bookCost = bookCost;
		authorName = "auther name";
	}

	public Book(String bookName, double bookCost, String authorName) {//overloaded constrector with auther name 

		this.bookName = bookName;
		this.bookCost = bookCost;
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookCost() {
		return bookCost;
	}

	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book bookName=" + bookName + ", bookCost=" + bookCost + ", authorName=" + authorName + " ";
	}

	@Override
	public int compareTo(Book o) {// to save book in sorted order class implimentaed with comparable 
		
		return this.bookName.compareTo(o.bookName);
	}

	
	

}
