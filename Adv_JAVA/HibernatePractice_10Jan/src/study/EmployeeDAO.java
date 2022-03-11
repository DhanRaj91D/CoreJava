package study;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import study.entity.EmployeeEntity;



public class EmployeeDAO {

	
	public boolean validateEmp(EmployeeEntity emp)
	{
		Session session=getSession();
		String quary = "select * from emp_tbl_hibernate where emp_uname = '"+emp.getUname()+"' && emp_pass ='"+emp.getPassword()+"'";
		Query<EmployeeEntity> nuser  =session.createNativeQuery(quary);
		List<EmployeeEntity> list= nuser.getResultList();
		
		if(list.isEmpty())
			return false;
		
		
		return true;
	}
	
	
	public boolean addEmp(EmployeeEntity emp)
	{
		
		Session session=getSession();
		Transaction tr= session.beginTransaction();
		session.save(emp);
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
