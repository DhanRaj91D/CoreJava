package study.entity;



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
