package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.PersonBean;

public class Application {
  
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(study.config.MyJavaConfig.class);
		PersonBean obj=(PersonBean) context.getBean("person1");
		
		System.out.println(obj.getName()+" "+ obj.getAdress()+" "+obj.getPcards());
		
	
	
	}

}
