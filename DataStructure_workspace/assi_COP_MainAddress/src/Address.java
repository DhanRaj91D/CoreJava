
public class Address {
	
	String flatno,buildingname,area,city,state,country,pincode;

	public Address(String flatno, String buildingname,String area, String city, String state, String country,
			String pincode) {
		
		this.flatno = flatno;
		this.buildingname = buildingname;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public String toString() {
		
		String str= "Address flatno=" + flatno + ", \nbuildingname=" + buildingname + ", \narea=" + area + ", \ncity=" + city
				+ ", \nstate=" + state + ", \ncountry=" + country + ", \npincode=" + pincode + "";
		
		return str;
	}
	

}
