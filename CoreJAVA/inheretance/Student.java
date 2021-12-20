package study.inheretance;

import study.hasarelation.MyDate;

public class Student extends Person {
	private int rollNo;

	public Student() {
		super();
		rollNo = 0;
		System.out.println("You are in parameterless constructor of student");
	}

	public Student(int rollNo, String name, MyDate dob) {
		super(name, dob);
		this.rollNo = rollNo;
		System.out.println("You are in parameterized constructor of student");
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student temp = (Student)obj;
			if(this.rollNo==temp.rollNo&& this.getName().equals(temp.getName()) && this.getDob().equals(temp.getDob())) {
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
		return "Student [RollNo=" + rollNo + ", Name : " + getName() + ", Date of birth :" + getDob() + "]";
	}
	
	

}
