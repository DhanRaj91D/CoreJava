package study.beans;

import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	
	private String area,city,state,country, pin;
	
	public AddressBean() {
		this.setArea("Near HighSchol");
		this.setCity("karanjkhop");
		this.setState("Maharashtra");
		this.setCountry("India");
		this.setPin("415525");

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
