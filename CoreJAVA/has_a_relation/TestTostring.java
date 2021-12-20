package study.hasarelation;

import study.inheretance.Employee;
import study.inheretance.IntershipStudent;
import study.inheretance.Patient;
import study.inheretance.Person;
import study.inheretance.Student;

public class TestTostring {
	
	public static void main(String[] args) {
		check(new Circle(10,new Point(10,11)));
		/*check(new Point(11,12));
		check(new Book());
		check(new MyDate(15, 11, 2021));
		check(new Product());
		check(new Person());
		check(new Student());
		check(new Employee());
		check(new Patient());
		check(new IntershipStudent());*/
	}
	
	public static void check(Object obj )
	{
		
		System.out.println(( (Circle)obj).toString()); 
	}

}
