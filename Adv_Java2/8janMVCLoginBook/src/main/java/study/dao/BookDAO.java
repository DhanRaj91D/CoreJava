package study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.Myrepository;
import study.entity.BookEntity;

@Repository
public class BookDAO {
	
	@Autowired
	Myrepository repos;
	
	
	public List<BookEntity> getBooks()
	{
		return repos.findAll();
	}
	
	public List<BookEntity> getdetails(String name)
	{
		return repos.findByBookName(name);
	}
	
	public void delete(BookEntity book)
	{
		repos.delete(book);
	}

	
}
