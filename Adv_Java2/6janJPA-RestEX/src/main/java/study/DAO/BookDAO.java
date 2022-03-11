package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.BookEntity;

@Service // Service = Bean = Repository all are same 
public class BookDAO {
	
	@Autowired
	MyRepository reps; /* we autowired our repository class here as we 
	want to use properties of it to do CRUD operations on Database  */ 
	
	public void addBook(int id, String name,int cost)
	{
		BookEntity b1= new BookEntity(id,name,cost);
		reps.save(b1);
		
	}
	
	public List<BookEntity> getAll(){
		
		return reps.findAll();
	}
	
	public List<BookEntity> getBookByCost(int cost)
	{
		
		return reps.findByCost(cost);
	}

	public List<BookEntity> getBookByName(String name)
	{
		
		return reps.findByBookName(name);
	}
	
	public List<BookEntity> getBookByCostLessThan(int cost)
	{
		
		return reps.findByCostLessThan(cost);
	}
	
	public List<BookEntity> getBookByCostGreterThan(int cost)
	{
		
		return reps.findByCostGreterThan(cost);
	}
}

