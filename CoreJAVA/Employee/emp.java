/*Q6.Create a class Employee with Members empId,name,salary,Address ad(containment) 
and create another class Address which has members 
street_Name,Building_name,pincode.Write a menu driven program to do below opertaions.
***Write getter and setter methods for both classes**
1.Display employees having salary > 5000
2.Display all details
3.Update particular employee salary by 20% depending upon empID
4.Search employee as per his employee id and display that employee
Hint:Make use of array of objects .*/
public class emp {
	private int ID;
	private String name;
	private int sal;
	private Address ad;
	public emp(int iD, String name, int sal,String street_name,String building_name,int pin_code) {
	
		ID = iD;
		this.name = name;
		this.sal = sal;
		this.ad = new Address(street_name, building_name, pin_code);
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}

	
	public String toString() {
		String str="";
		 str=str+ "emp ID=" + ID + ", name=" + name + ", sal=" + sal + ", ad=" + ad + "]";
		 
		 return str;
	}

	
	
	
	

}
