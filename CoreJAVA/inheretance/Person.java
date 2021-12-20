package study.inheretance;

import study.hasarelation.MyDate;

public class Person {
	private String name;
	private MyDate dob;

	public Person() {
		name = "";
		dob = new MyDate();
		System.out.println("You are in parameterless constructor of person");
	}

	public Person(String name, MyDate dob) {

		this.name = name;
		this.dob = dob;
		System.out.println("You are in parameterized constructor of person");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			if(this.name.equals(temp.name) && this.dob.equals(temp.dob)) {
				return true;
				
			}else {
				return false;
			}
		}
		else
		return false;
	}

	@Override
	public String toString() {
		return "name=" + name + ", dob=" + dob + "";
	}
	
	
	

}
