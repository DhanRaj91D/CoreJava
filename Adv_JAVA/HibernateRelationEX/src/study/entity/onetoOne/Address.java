package study.entity.onetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address220")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adressID;

	private String addressLine1, city, state, country;

	private int pincode;
	@OneToOne(targetEntity=Employee.class)
	private Employee employee;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int adressID, String addressLine1, String city, String state, String country, int pincode,
			Employee employee) {
		super();
		this.adressID = adressID;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.employee = employee;
	}
	public int getAdressID() {
		return adressID;
	}
	public void setAdressID(int adressID) {
		this.adressID = adressID;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [adressID=" + adressID + ", addressLine1=" + addressLine1 + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + ", employee=" + employee + "]";
	}


}
