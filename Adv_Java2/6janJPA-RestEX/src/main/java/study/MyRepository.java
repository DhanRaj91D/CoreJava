package study;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;

@Repository // Service = Bean = Repository all are same 
public interface MyRepository extends JpaRepository<BookEntity, Integer>{

	/* We want to perform CURD operations on Data from our database so
	 *  we extender this interface to Jpa repository which 
	 * contain all this methods already writen */
	public List<BookEntity> findByCost(int cost);
	public List<BookEntity> findByBookName(String name);
	
	@Query("from study.entity.BookEntity a where a.cost <:pCost")
	public List<BookEntity> findByCostLessThan(@Param("pCost") int cost);
	
	@Query(value = "select * from bookshop b where b.cost >:pCost", nativeQuery= true )
	public List<BookEntity> findByCostGreterThan(@Param("pCost") int cost);
}
