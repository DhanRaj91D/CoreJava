
public class Student {
	

	private int rollNo;
	private String Name;
	private boolean isExperianced;

	Student()
	{
		rollNo = 561;
		Name = "Sonal";


	}
	Student(int r,String n, boolean tf)
	{
		rollNo = r;
		Name = n;
		isExperianced = tf;
	}
	public void showStudentInfo()
	{
		toString();

	}
	public void setExperianced(boolean tf)
	{
		isExperianced = tf;
	}
	public String toString()
	{
		String str = " RollNo. : " + rollNo + " Name : "  + Name +  " IsExperianced :" +  isExperianced;  
		return str;
	}


}
