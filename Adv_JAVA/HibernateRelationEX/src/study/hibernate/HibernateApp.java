package study.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.onetoOne.Address;
import study.entity.onetoOne.Employee;

public class HibernateApp {
	
	public static void main(String[] args) {
		Session session=getSession();
		Transaction tr=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("Dhanraj");
		e1.setEmail("dsd@gmail");
		
		Address a1= new Address();
		a1.setAddressLine1(" House no 50 , neer Highschool");
		a1.setCity("Karanjkhop");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		a1.setPincode(415525);
		
		e1.setAdress(a1);
		a1.setEmployee(e1);
		session.save(e1);
		
		Employee e2=new Employee();
		e2.setName("Ram");
		e2.setEmail("ram@gmail");
		
		Address a2= new Address();
		a2.setAddressLine1(" House no 1 , neer Ram mandir");
		a2.setCity("Rampur");
		a2.setState("Maharashtra");
		a2.setCountry("India");
		a2.setPincode(415525);
		
		e2.setAdress(a2);
		a2.setEmployee(e2);
		
		session.save(e2);
		
		
		/*Employee e= session.find(Employee.class, 32);  // you can delete both the object at same time 
		session.delete(e);*/
		tr.commit();
		session.close();
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
