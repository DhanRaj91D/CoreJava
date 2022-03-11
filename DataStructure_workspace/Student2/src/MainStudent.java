import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) 
	{
		Student [] student;
		int n;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter Number Of Students: ");
		n = c.nextInt();
		student = new Student[n];

		populate(student,c);
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		
	}

	static void populate(Student[] student, Scanner c) {
		for (int i = 0; i < student.length; i++) {
			int r = 4;
			String n = "d";
			boolean tf = true;

			System.out.println("Enter roll: ");
			r = c.nextInt();

			System.out.println("Enter name: ");
			n = c.next();
			System.out.println("Enter true/false for not/yes: ");
			tf = c.nextBoolean();

			student[i] = new Student(r, n, tf);
		}

	}
}
