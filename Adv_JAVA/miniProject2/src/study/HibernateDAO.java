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

import study.entity.User;



public class HibernateDAO {
	
	public boolean validateuser(User user)
	{
		
		Session session =getSession();
		
		String query="select * from user_tbl where user_name='"+user.getUname()+"' && password='"+user.getPass()+"'";
		
		Query<User> newUser = session.createNativeQuery(query);
		List<User> users = newUser.getResultList();
		
		if(users.isEmpty())
			return false;
		
		return true;
		
	}
	
	
	
	public boolean AddUser(User nuser)
	{
		Session session=getSession();
		Transaction tr=session.beginTransaction();
		session.save(nuser);
		tr.commit();
		
		
		return true;
	}
	public static Session getSession() {

		//READING the hibernate.cfg.xml  from the classpath 
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		// Create MetadataSources
		MetadataSources Sources = new MetadataSources(registry);

		// Create Metadata
		Metadata metadata = Sources.getMetadataBuilder().build();

		// Create SessionFactory
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		// start a transaction
		Session session = sessionFactory.openSession();

		return session;
	}

}
