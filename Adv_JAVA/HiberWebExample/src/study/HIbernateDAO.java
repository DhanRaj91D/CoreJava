package study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.StudentEntity;

public class HIbernateDAO {

	public void addStudent(int id, String name) {
		Session session = getSession();
		Transaction tr = session.beginTransaction();
		StudentEntity entity = new StudentEntity(id, name);
		session.save(entity);
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
