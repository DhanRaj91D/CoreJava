import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Stack stud = new Stack();
		Student j= null ;
		Student k = populate_Stud();
		
		stud.push(k);
		j=stud.pop();
		System.out.println(j);
		

	}

	public static Student populate_Stud() {
		Scanner sc = new Scanner(System.in);

		String name = "";
		int age = 0;
		int rollno = 0;
		char gender;
		int[] marks = new int[5];

		System.out.println("Enter thne name of student : ");
		name = sc.nextLine();

		System.out.println("Enter thne age of student : ");
		age = sc.nextInt();

		System.out.println("Enter thne rollno of student : ");
		rollno = sc.nextInt();

		System.out.println("Enter thne gender of student : ");
		gender = sc.next().charAt(0);

		System.out.println("Enter thne marks of student : ");
		for (int j = 0; j < 5; j++) {
			marks[j] = sc.nextInt();
		}

		Student s = new Student(name, age, rollno, gender, marks);
		return s;

	}

}