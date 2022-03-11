import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many student you want to creat : ");
		int size = 0;
		size= sc.nextInt();
		Student[] student=new Student [size];
		populate_student(student,sc);
		print_stud(student);
		Sorting.Quick(student,false);
		print_stud(student);
		
	}
	
	public static void populate_student(Student[] student,Scanner sc)
	{
		for(int i=0;i<student.length;i++)
		{
			String name="";
			int rollno=0;
			
			System.out.println("Enter name: ");
			name = sc.next();
			
			System.out.println("Enter roll: ");
			rollno = sc.nextInt();
			
			
			student[i]=new Student(name,rollno);
		}
	}
	
	public static void print_stud(Student[] student)
	{
		for(int i=0;i<student.length;i++) {
			
			System.out.println(student[i]+ ", ");
		}
		System.out.println();
	}
}
