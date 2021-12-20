package study.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import TestCollection.MyDate3;

class Book implements Serializable {

	private String name;
	private String author;
	private double cost;
	private MyDate3 dateofPublicaton;

	public Book() {

	}

	public Book(String name, String author, double cost, MyDate3 dateofPublicaton) {

		this.name = name;
		this.author = author;
		this.cost = cost;
		this.dateofPublicaton = dateofPublicaton;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", cost=" + cost + ", dateofPublicaton=" + dateofPublicaton
				+ "]";
	}

}
