package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		BookDAO book= (BookDAO) context.getBean("book1");
		book.addBook(501, "Spring framework" , 500);
		
		
		
	}

}
