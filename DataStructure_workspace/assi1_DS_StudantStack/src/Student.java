public class Student {

	private String name;
	private int age;
	private int rollno;
	private char gender;
	private int[]marks;

	public Student(String name, int age, int rollno, char gender,int []marks) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.gender = gender;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int[] getMarks()
	{
		return marks;
	}

	public void setMarks(int[]marks)
	{
		this.marks = marks;
	}
	public String toString() {
		String str="";
		str = "Student Details : " + name + ", age=" + age + ", rollno=" + rollno + ", gender=" + gender +", marks" ;
		return str;
	}
	
		

}
