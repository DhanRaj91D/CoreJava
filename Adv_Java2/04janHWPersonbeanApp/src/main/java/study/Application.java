package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.PersonBean;

public class Application {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		PersonBean obj=(PersonBean) context.getBean("person1");
		System.out.println(obj.getName()+" "+obj.getAdress()+" "+obj.getPcards());
		
		
		
	}

}
