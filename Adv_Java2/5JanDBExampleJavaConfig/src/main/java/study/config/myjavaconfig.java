package study.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import study.BookDAO;

@Configuration
@ImportResource("classpath:beans.xml")
public class myjavaconfig {
	
	@Autowired
	DataSource ds;
	
	@Bean("book1")
	public BookDAO book()
	{
		BookDAO obj=new BookDAO();
		obj.setDs(ds);
		
		return obj;
	}

	
}
