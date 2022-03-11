package study;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Hiberappes {

	public static void main(String[] args) {

		Session session = getSession();

		
		/* update(session); */
/*		delete(session);*/

		/*
		 * Transaction trx= session.beginTransaction();
		 * 
		 * StudentEntity obj= new StudentEntity(1, "Dhanraj"); session.save(obj);
		 * 
		 * StudentEntity obj1 = new StudentEntity(2, "Komal"); session.save(obj1);
		 * 
		 * 
		 * trx.commit();
		 */

	}
	
	/*public static List<StudentEntity> getAllRowsUsingNative(){
		Session session= getSession();
		Qu
		
		
		
		
		return null;
	}
*/
	public static void update(Session session) {
		session.beginTransaction();

		StudentEntity fromDb = session.find(StudentEntity.class, 2);
		fromDb.setStudentName("Ram");
		session.getTransaction().commit();
	}

	public static void delete(Session session) {

		Transaction t = session.beginTransaction();

		StudentEntity obj = session.find(StudentEntity.class, 2);
		if (obj != null) {
			session.delete(obj);

		}

		t.commit();

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
