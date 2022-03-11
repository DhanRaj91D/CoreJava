 package study;

import java.sql.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.ProductEntity;

@Repository
public interface MyProductRepository extends JpaRepository<ProductEntity, Integer> {

	public List<ProductEntity> findByCost(int cost);
	public List<ProductEntity> findByName(String name);
	public List<ProductEntity> findByDescription(String description);
	public List<ProductEntity> findByExpirydate(Date expirydate);
	
	@Query("from study.entity.ProductEntity a where a.cost<:pCost")
	public List<ProductEntity> findBycostlessthan(@Param("pCost") int cost);
	
	@Query(value = "select * from product p where p.product_cost>:pCost", nativeQuery = true)
	public List<ProductEntity> findBycostgreterThan(@Param("pCost") int cost);
	
	
	/*
	 * @Query("from study.entity.ProductEntity a where datediff(a.expirydate,current())>:0"
	 * ) public List<ProductEntity> findBynotexpired(Date expirydate);
	 */
}
