package study.DAO;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.MyProductRepository;
import study.entity.ProductEntity;

@Repository
public class MyProductDAO {

	@Autowired
	MyProductRepository repo;

	public void add(int id, String name, int cost, String description, Date expirydate) {
		ProductEntity p1 = new ProductEntity(id, name, cost, description, expirydate);
		repo.save(p1);

	}

	public ProductEntity showProduct(int id) {
		Optional<ProductEntity> pd = repo.findById(id);
		
		return pd.get();
	}

	public List<ProductEntity> showAll() {
		return repo.findAll();
	}

	
	  public void delete(int id) {
		  Optional<ProductEntity> pd= repo.findById(id);
		  repo.delete(pd.get());
		  
	  }
	  
	  public void update(int id,int newcost)
	  {
		  Optional<ProductEntity> pd= repo.findById(id);
		  ProductEntity p= pd.get(); //pd.get() will convert optional entity to entity
		  p.setCost(newcost);
		  repo.save(p);
	  }
	  
	  public List<ProductEntity> getByCost(int cost)
	  {
		 return repo.findByCost(cost);
	  }
	  
	  public List<ProductEntity> getByName(String name)
	  {
		  return repo.findByName(name);
	  }
	  
	  public List<ProductEntity> getByDescription(String description)
	  {
		  return repo.findByDescription(description);
	  }
	  
	  public List<ProductEntity> getByExpiryDate(Date expirydate)
	  {
		  return repo.findByExpirydate(expirydate);
	  }
	  
	  public List<ProductEntity> getBycostLessthan(int cost)
	  {
		  return  repo.findBycostlessthan(cost);
	  }
	  
	  public List<ProductEntity> getBycostGreterthan(int cost)
	  {
		  return  repo.findBycostgreterThan(cost);
	  }
	  
	  public List<ProductEntity> getBynotExpired(Date expirydate)
	  {
		  return  repo.findByExpirydate(expirydate);
	  }
	
	
}
