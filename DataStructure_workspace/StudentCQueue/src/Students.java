
public class Students {
	
	private String name;
	private int age;
	private int rollno;
	private char gender;
	
	public Students(String name, int age, int rollno, char gender) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.gender = gender;
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

	public String toString() {
		String str="Student Details : Name= " + name + ", age=" + age + ", rollno=" + rollno + ", gender=" + gender ;
		return str;
	}

	
}
