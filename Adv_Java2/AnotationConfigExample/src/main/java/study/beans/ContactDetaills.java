package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactDetaills {
	
	private String phoneNumber,email;
	
	@Autowired
	private AddressBean adressbean;
	
	public ContactDetaills() {
		this.setEmail("Dhanraj@gmail");
		this.setPhoneNumber("999999999");
		
	}
	
	public AddressBean getAdressbean() {
		return adressbean;
	}

	public void setAdressbean(AddressBean adressbean) {
		this.adressbean = adressbean;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
