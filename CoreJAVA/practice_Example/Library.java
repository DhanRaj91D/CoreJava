package study.practiceExample;

import java.util.Iterator;
import java.util.TreeSet;

public class Library { 
	private TreeSet<Book> books;

	public Library() {
		books = new TreeSet<Book>();
	}

	public Library(TreeSet<Book> books) {

		this.books = books;
	}

	public TreeSet<Book> getBooks() {
		return books;
	}

	public void setBooks(TreeSet<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}

	public void showAllBooksInSortedOrderOfName() {
		TreeSet<Book> temp = new TreeSet<>(new SortByBookname());

		Iterator<Book> it = this.books.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			temp.add(b);
		}
		
		for (Iterator iterator = temp.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(book);
		}

	}

	public void showAllBooksInSortedOrderOfAuthor() {
		
		TreeSet<Book> temp = new TreeSet<>(new SortbyAuther());

		Iterator<Book> it = this.books.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			temp.add(b);
		}
		
		for (Iterator iterator = temp.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(book);
		}


	}

}
