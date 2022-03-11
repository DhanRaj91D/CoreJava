package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.PersonBean;

public class Application {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("study.beans");
		context.refresh();
		
		PersonBean obj=(PersonBean) context.getBean("person1");
	System.out.println(obj.getName()+" "+obj.getAdress()+" "+obj.getClass());
	
	}

}
