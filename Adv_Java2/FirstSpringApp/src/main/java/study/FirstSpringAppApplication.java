package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBeans;





public class FirstSpringAppApplication {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBeans  obj= (MessageBeans) context.getBean("first");
		
		System.out.println( obj.getMessage()+" "+obj.getSender()+" "+obj.getContactDetails().getPhoneNumber());
		System.out.println(obj.getContactDetails().getAdressbean().getArea()+" "+obj.getContactDetails().getAdressbean().getCity());		
		MessageBeans obj1=  (MessageBeans) context.getBean("singleton");  
		System.out.println(obj1.getMessage()+" "+obj1.getSender()+" "+obj1.getContactDetails().getEmail());
		
		MessageBeans obj2=context.getBean("singleton", MessageBeans.class);
		System.out.println(obj2.getMessage()+" "+obj2.getSender());
		
		
		
	}

}
