package study;

/*import org.springframework.boot.SpringApplication;*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.MessageBeans;
/*import study.config.myConfig;*/

public class JavaConfigExampleAppApplication {

	public static void main(String[] args) {
		/* SpringApplication.run(myConfig.class, args); */
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(study.config.myConfig.class);
		
		MessageBeans obj=(MessageBeans) context.getBean("first");
		System.out.println(obj.getMessage());
		System.out.println(obj.getMessage()+" "+obj.getContactDetails().getPhoneNumber()+" "+obj.getContactDetails().getAdressbean().getPin());

		
		
	}

}
