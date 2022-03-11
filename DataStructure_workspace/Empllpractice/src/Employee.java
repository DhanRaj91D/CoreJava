
public class Employee {
	
	private int EmpId;
	private String name;
	private int age;
	private char gender;
	
	public Employee(int i,String n,int a, char g)
	{
		EmpId=i;
		name=n;
		age=a;
		gender=g;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString()
	{
		String str="";
		
		str=str+ "Employee Id "+EmpId+ ", Name " +name+ ", Age "+ age + ", Gender " + gender ;
		
		return str;
	}

}
