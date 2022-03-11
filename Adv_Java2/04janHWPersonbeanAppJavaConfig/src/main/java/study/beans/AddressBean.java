package study.beans;

public class AddressBean {
	
	private String area,city,state,pin;


	public AddressBean() {

	
	}

	
	@Override
	public String toString() {
		return "AddressBean [area=" + area + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}


	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
