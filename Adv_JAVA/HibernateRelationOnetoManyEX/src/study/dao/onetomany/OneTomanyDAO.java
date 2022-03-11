package study.dao.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.onetomany.AccountEntity;
import study.entity.onetomany.EmployeeEntity;

public class OneTomanyDAO {
	
	public static void main(String[] args) {
		
		Session session =getSession();
		Transaction tr=session.beginTransaction();
		AccountEntity a=new AccountEntity();
		a.setAccountNumber("AAAAAAAAA");
		AccountEntity a1=new AccountEntity();
		a.setAccountNumber("BBBBBBBB");
		AccountEntity a2=new AccountEntity();
		a.setAccountNumber("CCCCCCCC");
		
		
		EmployeeEntity e1=new EmployeeEntity();
		e1.setEmail("abc@gmail");
		e1.setFirsttName("Dhanraj");
		e1.setLastName("Dhumal");
		
		Set<AccountEntity> s1 = new HashSet<>();
		s1.add(a1);
		s1.add(a2);
		
		e1.setAccounts(s1);
		
		session.save(e1);
				
		
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
