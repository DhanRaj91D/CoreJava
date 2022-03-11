package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(study.config.myjavaconfig.class);
		
		BookDAO book = (BookDAO) context.getBean("book1");
		book.addBook(403, "DAO", 500);
		
		
	}

}
