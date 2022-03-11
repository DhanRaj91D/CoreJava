package study.beans;

public class ContactDetaills {
	
	private String phoneNumber,email;
	
	private AddressBean adressbean;
	
	public ContactDetaills() {
		
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
