package User.inheretance;

import study.hasarelation.MyDate;
import study.inheretance.IntershipStudent;

public class User2 {
	public static void main(String[] args) {
		IntershipStudent intern = new IntershipStudent(5000, 1, "Dhanraj", new MyDate(16, 05, 1998));

		System.out.println("Roll No :" + intern.getRollNo() + ", Name :" + intern.getName() + ", Date of Birth :"
				+ intern.getDob());

	}

}
