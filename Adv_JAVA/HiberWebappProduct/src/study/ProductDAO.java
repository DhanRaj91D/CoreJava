package study;



import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.groceryEntity;

public class ProductDAO {
	
	public boolean addNewProduct(int product_id, String product_name, String product_desc, int unit, int cost,
			String expiry_date) {
		
		Session session = getSession();
		Transaction tr = session.beginTransaction();
		groceryEntity gt = new groceryEntity(product_id, product_name, product_desc, unit, cost, expiry_date);
		session.save(gt);
		tr.commit();
		session.close();
		return true;

	}
	
	
	public boolean changeProperty(int id,String value,int key) {

		Session session = getSession();
		session.beginTransaction();
	
		groceryEntity fromDB = session.find(groceryEntity.class, id);
		if(fromDB!=null)
		{
		
		switch (key) {
		
		case 1:
			fromDB.setProduct_name(value);
			break;
		case 2:
			fromDB.setProduct_desc(value);
			break;
		case 3:
			fromDB.setExpiry_date(value);
			break;
		case 4:
			fromDB.setCost(Integer.parseInt(value));
			break;
		case 5:
			fromDB.setUnit(Integer.parseInt(value));
			break;
		}
		session.getTransaction().commit();
		session.close();
		return true;
		
		}
		else
			return false;
	}
	
	
	public boolean delete(int id) {
		Session session = getSession();
		Transaction tr = session.beginTransaction();
		groceryEntity gr = session.find(groceryEntity.class, id);
		if (gr != null) {
			session.delete(gr);
			tr.commit();
			session.close();
			return true;
		}

		
		return false;
	}


	public groceryEntity showDetails(int id) {
		Session session = getSession();

		groceryEntity gr = session.find(groceryEntity.class, id);
		session.close();
		return gr;

		

	}
	
	public List<groceryEntity> showAllDetails() {
		Session session = getSession();
		Transaction tr= session.beginTransaction();
		List<groceryEntity> gList=session.createQuery("select alias from grocery_product alias").getResultList();
		tr.commit();
		session.close();
		return gList;
		
	}
	
	

	
	
	public static Session getSession() {
		// READING the hibernate.cfg.xml from the classpath
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession(); // start a transaction

		return session;

	}

}
