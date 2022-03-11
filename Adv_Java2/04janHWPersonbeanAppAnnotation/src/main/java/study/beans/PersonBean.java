package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("person1")
@Scope("prototype")
public class PersonBean {
	
	private String name;
	
	@Autowired
	private AddressBean adress;
	
	@Autowired
	private CardsBean pcards;

	public PersonBean() {

		this.setName("Dhanraj");
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
