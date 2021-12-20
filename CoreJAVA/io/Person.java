package study.io;

import java.io.Serializable;

import TestCollection.MyDate3;

public class Person implements Serializable {

	private String name;
	private MyDate3 dob;

	public Person() {

	}

	public Person(String name, MyDate3 dob) {

		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}

}

class Student extends Person implements Serializable {

	private int rollno;

	public Student() {

	}

	public Student(String name, MyDate3 dob, int rollno) {
		super(name, dob);
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return super.toString() + "Student [rollno=" + rollno + "]";
	}

}
