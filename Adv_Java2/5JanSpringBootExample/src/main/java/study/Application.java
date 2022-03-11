package study;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import study.dao.BookDAO;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Application.class, args);
		BookDAO obj=(BookDAO) context.getBean("book1");
		obj.addBook(91, "SpringBoot", 1000);
		
		
		
	}
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		 dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dmds.setUrl("jdbc:mysql://localhost:3306/adv_java");
		 dmds.setUsername("root");
		 dmds.setPassword("root");
		 
		 return dmds;

	}

}
