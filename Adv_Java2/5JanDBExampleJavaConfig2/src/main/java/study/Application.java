package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("study","study.config");
	context.refresh();
	BookDAO obj=(BookDAO) context.getBean("book1");
	
	obj.addBook(301, "Senario4", 200);
	
	}

}
