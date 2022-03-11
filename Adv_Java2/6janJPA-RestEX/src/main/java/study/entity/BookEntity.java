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
	private int id;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "cost")
	private int cost;

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public BookEntity(int id, String bookName, int cost) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.cost = cost;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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
		return "BookEntity [ID=" + id + ", bookName=" + bookName + ", cost=" + cost + "]";
	}
	
	
	
	
	

}
