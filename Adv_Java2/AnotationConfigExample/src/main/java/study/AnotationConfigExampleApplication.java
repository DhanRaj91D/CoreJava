package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.MessageBeans;

public class AnotationConfigExampleApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("study.beans");
		context.refresh();
		
		MessageBeans obj= (MessageBeans) context.getBean("first");
		
		System.out.println(obj.getMessage()
				  +"   "+obj.getSender()+"  "+obj.getContactDetails().getPhoneNumber()+"  "+obj
				  .getContactDetails().getAdressbean().getCity()+" "+obj.getContactDetails().
				  getAdressbean().getPin());
		
		
	}

}
