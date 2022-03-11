package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookshop")
public class BookEntity {
	
	@Id
	@Column(name = "book_id")
	private int ID;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "cost")
	private int cost;

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookEntity(int iD, String bookName, int cost) {
		super();
		ID = iD;
		this.bookName = bookName;
		this.cost = cost;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookEntity [ID=" + ID + ", bookName=" + bookName + ", cost=" + cost + "]";
	}
	
	
	
	
	

}
