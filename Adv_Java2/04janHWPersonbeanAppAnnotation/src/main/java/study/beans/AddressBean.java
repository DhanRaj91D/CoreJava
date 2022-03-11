package study.beans;

import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	
	private String area,city,state,pin;


	public AddressBean() {

		this.setArea("Akurdi");
		this.setCity("impriChunchwad");
		this.setState("Maharshtra");
		this.setPin("415525");
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
