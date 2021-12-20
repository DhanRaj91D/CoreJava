package User.inheretance;

import study.hasarelation.MyDate;
import study.inheretance.Student;

public class User1 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setName("Dhanraj");
		s1.setDob(new MyDate(16, 05, 1998));
		System.out
				.println("Roll No :" + s1.getRollNo() + ", Name :" + s1.getName() + ", Date of Birth :" + s1.getDob());

	System.out.println(s1);
	}

}
