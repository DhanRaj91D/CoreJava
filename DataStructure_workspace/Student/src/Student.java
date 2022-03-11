import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Students[] details;
		int noOfstu = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many studenbt details you want to save : ");
		noOfstu = sc.nextInt();
		details = new Students[noOfstu];

		populate_stu(details, sc);

		for (int j = 0; j < details.length; j++) {
			System.out.println(details[j]);
		}

		find_female(details);
		find_male(details);
		find_elder(details);
		 find_youngest(details );
		find_highestrollno(details);

	}

	public static void populate_stu(Students[] details, Scanner sc) {

		for (int i = 0; i < details.length; i++) {
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

			details[i] = new Students(name, age, rollno, gender);

		}

	}

	public static void find_female(Students[] details) {
		System.out.println("Female Students : ");
		for (int j = 0; j < details.length; j++) {
			Students gender = details[j];
			char a = gender.getGender();
			if (a == 'F') {
				System.out.println(details[j].getName());
			}

		}

	}

	public static void find_male(Students[] details) {
		System.out.println("Male Students : ");
		for (int j = 0; j < details.length; j++) {
			Students gender = details[j];
			char a = gender.getGender();
			if (a == 'M') {
				System.out.println(details[j].getName());
			}

		}

	}

	public static void find_elder(Students[] details) {
		System.out.println("Elder Student : ");
		Students age = details[0];
		int a = age.getAge();
		for (int j = 0; j < details.length; j++) {
			Students y = details[j];

			if (a < y.getAge()) {
				a = y.getAge();

				System.out.println(details[j].getName());
			}

		}
	}

	public static void find_youngest(Students[] details) {
		System.out.println("Youngest Student : ");
		Students age = details[0];
		int a = age.getAge();
		for (int j = 0; j < details.length; j++) {
			Students y = details[j];

			if (a > y.getAge()) {
				a = y.getAge();

				System.out.println(details[j].getName());
			}

		}

	}

	public static void find_highestrollno(Students[] details) {
		System.out.println("highest rollno : ");
		Students roll = details[0];
		int a = roll.getRollno();
		for (int j = 0; j < details.length; j++) {
			Students y = details[j];

			if (a < y.getRollno()) {
				a = y.getRollno();

				System.out.println(details[j].getName());
			}

		}

	}
}
