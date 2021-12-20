package practiceProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// populate read function
		List<Student> students = null;
		try {
			students = StudentIOOperation.readFromFile();

		} catch (StudentDbNotfound e) {
			
			students = new ArrayList<Student>();
		}
		boolean flag = true;
		while (flag) {
			System.out.println("********************************************");
			System.out.println("Operation available");
			System.out.println("********************************************");
			System.out.println("0.Show all student)");
			System.out.println("1.Add Student(user input : name,age,markes)");
			System.out.println("2.Add Student(user input : name,age)");
			System.out.println("3.Search student by name ");
			System.out.println("4.Remove student by name ");
			System.out.println("5.Remove all student");
			System.out.println("6.Exit without save");
			System.out.println("7.Exit with save");
			// save all write in file call function
			System.out.println("********************************************");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			if (flag == false)
				break;

			switch (choice) {

			case 0: {
				Iterator<Student> it = students.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			}
			case 1: {
				System.out.println("Enter Student details with marks ");
				students.add(populatestudwithMarks(sc));
				break;
			}
			case 2: {
				System.out.println("Enter Student details ");
				students.add(populatestud(sc));
				break;
			}
			case 3: {
				sc.nextLine();
				System.out.println("Enter student name to search student : ");
				String name = sc.nextLine();
				Iterator<Student> it = students.iterator();
				while (it.hasNext()) {
					if (name.equalsIgnoreCase(it.next().getName())) {
						System.out.println(it);
					}
				}
				break;
			}
			case 4: {
				sc.nextLine();
				System.out.println("Enter student name to Remove student : ");
				String name = sc.nextLine();

				Iterator<Student> it = students.iterator();
				while (it.hasNext()) {
					if (name.equalsIgnoreCase(it.next().getName())) {
						it.remove();
					}

				}

				break;
			}
			case 5: {
				System.out.println("You are removing students : ");
				students.removeAll(students);
				break;
			}
			case 6: {
				System.out.println("You exited without saving list on file:");
				flag = false;
				break;
			}
			case 7: {
				try {

					StudentIOOperation.writeToFile(students);
					System.out.println("object saveed on file sucessfully...... ");
					flag = false;

				} catch (Exception e) {
					System.out.println(e);
				}

				break;
			}

			default: {
				System.out.println("Wrong input");
			}

			}// end of swith

		} // end pof while

	}// end of main

	private static Student populatestudwithMarks(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter the student age : ");
		int age = sc.nextInt();
		System.out.println("Enter the marks of student : ");
		int[] marks = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		return new Student(name, age, marks);

	}

	private static Student populatestud(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter the student age : ");
		int age = sc.nextInt();

		return new Student(name, age);

	}

}// end of userProject
