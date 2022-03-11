package study.beans;

public class PersonBean {
	
	private String name;
	
	private AddressBean adress;
	
	private CardsBean pcards;

	public PersonBean() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBean getAdress() {
		return adress;
	}

	public void setAdress(AddressBean adress) {
		this.adress = adress;
	}

	public CardsBean getPcards() {
		return pcards;
	}

	public void setPcards(CardsBean pcards) {
		this.pcards = pcards;
	}

	

}
