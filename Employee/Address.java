/*Ceate another class Address which has members 
street_Name,Building_name,pincode.*/
public class Address {
	private String Street_name;
	private String Building_name;
	private int Pin_code;
	public Address(String street_name, String building_name, int pin_code) {
		Street_name = street_name;
		Building_name = building_name;
		Pin_code = pin_code;
	}
	public String getStreet_name() {
		return Street_name;
	}
	public void setStreet_name(String street_name) {
		Street_name = street_name;
	}
	public String getBuilding_name() {
		return Building_name;
	}
	public void setBuilding_name(String building_name) {
		Building_name = building_name;
	}
	public int getPin_code() {
		return Pin_code;
	}
	public void setPin_code(int pin_code) {
		Pin_code = pin_code;
	}

	public String toString() {
		String str ="";
		str="Street_name=" + Street_name + ", Building_name=" + Building_name + ", Pin_code=" + Pin_code
				+ "";
		return str;
	}
	
	
}


 