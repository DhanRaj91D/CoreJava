import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

	
		//int noOfstu = 0;
		//Scanner sc = new Scanner(System.in);

		/*System.out.println("Enter how many student details you want to save : ");
		noOfstu = sc.nextInt();
		details = new Students[noOfstu];*/
		StudQueue q1=new StudQueue();
		
		Students s1 = populate_stu();
		q1.insert(s1);
		
		Students s2 = populate_stu();
		q1.insert(s2);
		
		q1.remove();
	
		
		
		
		System.out.println(q1);

	}

	public static Students populate_stu() {
		
		Scanner sc = new Scanner(System.in);
	
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
			sc.close();
			return s;
			
			
		}
		

	}

