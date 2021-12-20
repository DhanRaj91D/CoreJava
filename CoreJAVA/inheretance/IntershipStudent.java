package study.inheretance;

import study.hasarelation.MyDate;

public class IntershipStudent extends Student {
	private int stipend;

	public IntershipStudent() {
		super();
		stipend = 0;
		System.out.println("You are in parameterless constructor of Internshipstudent");
	}

	public IntershipStudent(int stipend, int rollNo, String name, MyDate dob) {
		super(rollNo, name, dob);
		this.stipend = stipend;
		System.out.println("You are in parameterized constructor of Internshipstudent");
	}

	public int getStipend() {
		return stipend;
	}

	public void setStipend(int stipend) {
		this.stipend = stipend;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IntershipStudent) {
			IntershipStudent temp=(IntershipStudent)obj;
			if(this.stipend==temp.stipend&&this.getName().equals(temp.getName())&&this.getRollNo()==temp.getRollNo()
					&& this.getDob().equals(temp.getDob())) {
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
		return "IntershipStudent [stipend=" + stipend + "]";
	}
	
	

}
