import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_of_Student l =new Stack_of_Student();
		
		Students s= populate_stu(sc);
		
		l.push(s);
		
		l.push(s);
		
		l.empty_Stack();
		System.out.println(l);
		

	}

	
	public static Students populate_stu(Scanner sc) {

		String name = "";
		int age = 0;
		int rollno = 0;
		char gender;

		System.out.println("Enter the name of student: ");
		name = sc.next();

		System.out.println("Enter the age of student: ");
		age = sc.nextInt();

		System.out.println("Enter the roll no of student: ");
		rollno = sc.nextInt();

		System.out.println("Enter the gender of student: ");
		gender = sc.next().charAt(0);

		Students s = new Students(name, age, rollno, gender);
		return s;

	}

}
