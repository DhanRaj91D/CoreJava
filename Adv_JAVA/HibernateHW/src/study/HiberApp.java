package study;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HiberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Session session = getSession();
		boolean flag = true;
		while (flag) {

			System.out.println("Which details you want to change");
			System.out.println(
					"1.Add new Product\n2.Change product property\n3.Delete a product\n4.Show details of product\n5.Quit");
			System.out.println("Enter the choice : ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				addNewProduct(session, sc);
				break;

			case 2:
				changeProperty(session, sc);

				break;
			case 3:
				delete(session, sc);

				break;
			case 4:
				showDetails(session, sc);

				break;
			case 5:
				System.out.println("Byeeee..");
				flag = false;
				break;

			default:
				System.out.println();
				break;
			}
		}
	}

	public static void addNewProduct(Session session, Scanner sc) {

		System.out.println("Enter the product ID :");
		int product_id = sc.nextInt();
		System.out.println("Enter the product_name :");
		String product_name = sc.next();
		System.out.println("Enter the product_desc :");
		String product_desc = sc.next();
		System.out.println("Enter the unit :");
		int unit = sc.nextInt();
		System.out.println("Enter the cost :");
		int cost = sc.nextInt();
		System.out.println("Enter the expiry_date :");
		String expiry_date = sc.next();

		Transaction tr = session.beginTransaction();
		groceryEntity gt = new groceryEntity(product_id, product_name, product_desc, unit, cost, expiry_date);
		session.save(gt);
		tr.commit();

	}

	public static void changeProperty(Session session, Scanner sc) {

		session.beginTransaction();
		System.out.println("Enter the product ID to make changes:");
		int ID = sc.nextInt();

		groceryEntity fromDB = session.find(groceryEntity.class, ID);
		boolean flag = true;
		while (flag) {

			System.out.println("Which details you want to change");
			System.out.println("1.product_id\n2.product_name\n3.product_desc\n4.expiry_date\n5.cost\n6.unit\n7.Quit");
			System.out.println("Enter the choice : ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter the updated ID:");
				fromDB.setProduct_id(sc.nextInt());
				break;

			case 2:
				System.out.println("Enter the updated product_name:");
				fromDB.setProduct_name(sc.next());
				break;
			case 3:
				System.out.println("Enter the updated product_desc:");
				fromDB.setProduct_desc(sc.next());

				break;
			case 4:
				System.out.println("Enter the updated expiry_date:");
				fromDB.setExpiry_date(sc.next());
				break;
			case 5:
				System.out.println("Enter the updated cost:");
				fromDB.setCost(sc.nextInt());
				break;
			case 6:
				System.out.println("Enter the updated unit:");
				fromDB.setUnit(sc.nextInt());
				break;

			case 7:
				System.out.println("Byee...");
				flag = false;
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}

		}
		session.getTransaction().commit();

	}

	public static void delete(Session session,Scanner sc) {
		Transaction tr = session.beginTransaction();

		System.out.println("Enter product id you want to delete: ");
		int id=sc.nextInt();
		groceryEntity gr = session.find(groceryEntity.class, id);

		if (gr != null) {

			session.delete(gr);
		}

		tr.commit();
	}

	public static void showDetails(Session session ,Scanner sc) {
		Transaction tr = session.beginTransaction();

		System.out.println("Enter product id you want to see: ");
		int id=sc.nextInt();
		groceryEntity gr = session.find(groceryEntity.class, id);

		if (gr != null) {

			System.out.println("gr");
		}

		tr.commit();
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
