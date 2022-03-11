package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import study.beans.AddressBean;
import study.beans.CardsBean;
import study.beans.PersonBean;

@Configuration
public class MyJavaConfig {
	
	@Bean("person1")
	@Scope("prototype")
	public PersonBean person()
	{
		PersonBean obj=new PersonBean();
		obj.setName("Dhanraj");
		obj.setAdress(address());
		obj.setPcards(cards());
		return obj;
	}

	@Bean("address1")
	@Scope("singleton")
	public AddressBean address() {
		AddressBean obj=new AddressBean();
		obj.setArea("akurdi");
		obj.setCity("pimpri Chinchwad");
		obj.setState("Maharashtra");
		obj.setPin("411018");
		return obj;
	}
	
	@Bean("cards1")
	@Scope("prototype")
	public CardsBean cards() {
		CardsBean obj=new CardsBean();
		obj.setAdhar("111111");
		obj.setPan("222222");
		obj.setPassport("333333");
		obj.setVoterID("444444");
		return obj;
	}

}
