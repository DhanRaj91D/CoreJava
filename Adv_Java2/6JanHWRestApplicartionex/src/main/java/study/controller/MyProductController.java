package study.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.MyProductDAO;
import study.entity.ProductEntity;

@RestController
@RequestMapping("/product")
public class MyProductController {
	
	@Autowired
	MyProductDAO dao =new MyProductDAO();
	
	@PostMapping("/add/{id}/{name}/{cost}/{Description}/{expirydate}")
	public void add(@PathVariable int id, @PathVariable String name, @PathVariable int cost, @PathVariable String Description, @PathVariable Date expirydate)
	{
		dao.add(id, name, cost, Description, expirydate);
		
	} 
	
	@GetMapping("/showall")
	public List<ProductEntity> showAll()
	{
		return dao.showAll();
	}
	
	@GetMapping("/show/{id}")
	public ProductEntity showProduct(@PathVariable int id)
	{
		return dao.showProduct(id);
		
	}
	
	@DeleteMapping("/remove/{id}")
	public void delete(@PathVariable int id)
	{
		dao.delete(id);
	}
	
	@PutMapping("/update/{id}/{newcost}")
	public void update(@PathVariable int id , @PathVariable int newcost)
	{
		 dao.update(id, newcost);
	}
	
	@GetMapping("/showbycost/{cost}")
	public List<ProductEntity> getBycost(@PathVariable int cost)
	{
		return dao.getByCost(cost);
	}
	
	@GetMapping("/showbyname/{name}")
	public List<ProductEntity> getByname(@PathVariable String name)
	{
		return dao.getByName(name);
	}
	
	@GetMapping("/showbydesc/{description}")
	public List<ProductEntity> getBydescription(@PathVariable String description)
	{
		return dao.getByDescription(description);
	}
	
	@GetMapping("/showbyexpriydate/{expirydate}")
	public List<ProductEntity> getByexpitydate(@PathVariable Date expirydate)
	{
		return dao.getByExpiryDate(expirydate);
	}
	
	
	@GetMapping("/costlessthan/{cost}")
	public List<ProductEntity> getbyCostLessthan(@PathVariable int cost)
	{
		return dao.getBycostLessthan(cost);
	}
	
	@GetMapping("/costgreterthan/{cost}")
	public List<ProductEntity> getbyCostGreterthan(@PathVariable int cost)
	{
		return dao.getBycostGreterthan(cost);
	}
	
	@GetMapping("/notExpired")
	 public List<ProductEntity> getBynotExpired()
	  {
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis); 
		System.out.println(date);
		  return  dao.getBynotExpired(date);
	  }
	
	
}
