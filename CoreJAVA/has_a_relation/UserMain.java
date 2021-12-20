package study.hasarelation;

import study.inheretance.Employee;
import study.inheretance.IntershipStudent;
import study.inheretance.Patient;
import study.inheretance.Person;
import study.inheretance.Student;

public class UserMain {
	public static void main(String[] args) {
		System.out.println("For myDate class");
		checkEqaulity(new MyDate(11, 11, 2021), new MyDate(11, 11, 2021));
		checkEqaulity(new MyDate(12, 11, 2021), new MyDate(11, 11, 2021));
		System.out.println("*****************************************");

		System.out.println("For Point class");
		checkEqaulity(new Point(11, 12), new Point(12, 11));
		checkEqaulity(new Point(11, 12), new Point(11, 12));
		System.out.println("*****************************************");

		System.out.println("For Circle class");
		checkEqaulity(new Circle(11, new Point(11, 15)), new Circle(11, new Point(11, 15)));
		checkEqaulity(new Circle(22, new Point(12, 23)), new Circle(11, new Point(01, 5)));
		System.out.println("*****************************************");

		System.out.println("For Person class");
		checkEqaulity(new Person("Dhanraj", new MyDate(11, 11, 2021)), new Person("Dhanraj", new MyDate(11, 11, 2021)));
		checkEqaulity(new Person("Dhanraj", new MyDate(12, 11, 2021)), new Person("Dhanraj", new MyDate(11, 11, 2021)));
		System.out.println("*****************************************");

		System.out.println("For Student class");
		checkEqaulity(new Student(1, "Dhanraj", new MyDate(11, 11, 2021)),
				new Student(1, "Dhanraj", new MyDate(11, 11, 2021)));
		checkEqaulity(new Student(1, "Dhanraj", new MyDate(11, 11, 2021)),
				new Student(1, "Dhanraj", new MyDate(12, 11, 2021)));
		checkEqaulity(new Student(1, "Dhanraj", new MyDate(11, 11, 2021)),
				new Student(1, "Dhumal", new MyDate(11, 11, 2021)));
		System.out.println("*****************************************");

		System.out.println("For Employee class");
		checkEqaulity(new Employee(1, "Dhanraj", "Development", 100000, new MyDate(11, 11, 2021)),
				new Employee(1, "Dhanraj", "Development", 100000, new MyDate(11, 11, 2021)));
		checkEqaulity(new Employee(1, "Dhumal", "Development", 100000, new MyDate(11, 11, 2021)),
				new Employee(1, "Dhanraj", "Development", 100000, new MyDate(11, 11, 2021)));
		checkEqaulity(new Employee(1, "Dhanraj", "Development", 100000, new MyDate(11, 11, 2021)),
				new Employee(1, "Dhanraj", "Development", 10000, new MyDate(11, 11, 2021)));
		System.out.println("*****************************************");
		
		System.out.println("For Patient class");
		checkEqaulity(new Patient("Dhanraj", new MyDate(11, 11, 2021), "cold"),
				new Patient("Dhanraj", new MyDate(11, 11, 2021), "cold"));
		checkEqaulity(new Patient("Dhanraj", new MyDate(11, 11, 2021), "cld"),
				new Patient("Dhanraj", new MyDate(11, 11, 2021), "cold"));
		checkEqaulity(new Patient("Danraj", new MyDate(11, 11, 2021), "cold"),
				new Patient("Dhanraj", new MyDate(11, 11, 2021), "cold"));
		System.out.println("*****************************************");
		
		System.out.println("For Student class");
		checkEqaulity(new IntershipStudent(1000,1, "Dhanraj", new MyDate(11, 11, 2021)),
				new IntershipStudent(100,1, "Dhanraj", new MyDate(11, 11, 2021)));
		checkEqaulity(new IntershipStudent(1000,1, "Dhanraj", new MyDate(11, 11, 2021)),
				new IntershipStudent(1000,1, "Dhanraj", new MyDate(11, 11, 2021)));
		checkEqaulity(new IntershipStudent(1000,1, "Dhanraj", new MyDate(11, 11, 2021)),
				new IntershipStudent(1000,12, "Dhanraj", new MyDate(11, 11, 2021)));
		System.out.println("*****************************************");
  
	}

	public static void checkEqaulity(Object obj1, Object obj2) {

		if (obj1.equals(obj2))
			System.out.println("they are equal");
		else
			System.out.println("they are not equal");

	}

}
