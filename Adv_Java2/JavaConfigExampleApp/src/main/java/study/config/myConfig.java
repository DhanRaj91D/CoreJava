package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import study.beans.AddressBean;
import study.beans.ContactDetaills;
import study.beans.MessageBeans;

@Configuration
public class myConfig {

	@Bean("first")
	public MessageBeans func1() {
		MessageBeans obj = new MessageBeans();
		obj.setMessage("Hello in java config");
		obj.setSender("Dhanraj");
		 obj.setContactDetails(func2()); 
		return obj;
	}

	@Bean
	public ContactDetaills func2() {
		ContactDetaills obj = new ContactDetaills();

		obj.setEmail("Dhanraj@gmail");
		obj.setPhoneNumber("9999999999");
		obj.setAdressbean(func3());
		return obj;

	}

	@Bean
	public AddressBean func3() {

		AddressBean obj = new AddressBean();
		obj.setArea("near HighSchool");
		obj.setCity("karanjkhgop");
		obj.setState("Maharashtra");
		obj.setCountry("India");
		obj.setPin("415525");
		return obj;
	}
}
