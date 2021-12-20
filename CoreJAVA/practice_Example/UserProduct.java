package study.practiceExample;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		boolean flag = true;

		while (flag) {

			System.out.println("**********************");
			System.out.println("Operations Available ");
			System.out.println("**********************");
			System.out.println("1. Add to list ");
			System.out.println("2.Write to file");
			System.out.println("3.show all product from list ");
			System.out.println("4.Read from file ");
			System.out.println("Enter choice :");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				productList.add(populateProduct(sc));

				break;
			}
			case 2: {
				Productserialize.Writeproduct(productList);
				System.out.println("List added to file sycsessfully .........");
				flag = false;

				break;
			}
			case 3: {
				System.out.println("Product available in list : ");
				for (Iterator iterator = productList.iterator(); iterator.hasNext();) {
					Product product = (Product) iterator.next();
					System.out.println(product);
				}

				break;
			}
			case 4: {
				readFromFile();
				break;
			}
			default:
				System.out.println("Invalid input .....");
				break;

			}

		}

	}

	private static void readFromFile() {
		List<Product> productList = Productserialize.DeSerialize();

		for (Iterator iterator = productList.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}

	}

	private static Product populateProduct(Scanner sc) {

		sc.nextLine();
		System.out.println("enter the product name :");
		String productname = sc.nextLine();

		System.out.println("Enter the cost of product : ");
		double cost = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the description of product : ");
		String description = sc.nextLine();
		System.out.println("Enter the brand of product : ");
		String brand = sc.nextLine();

		return new Product(productname, cost, description, brand);
	}

}

class Productserialize {

	public static void Writeproduct(List<Product> list) {

		try {
			ObjectOutputStream ostream = new ObjectOutputStream(
					new FileOutputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\14\\Product.txt"));

			Iterator<Product> it = list.iterator();
			while (it.hasNext()) {
				Product obj = it.next();
				ostream.writeObject(obj);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static List<Product> DeSerialize() {

		List<Product> list = new ArrayList<>();

		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\14\\Product.txt"));
			while (true) {
				Product obj = (Product) oin.readObject();
				list.add(obj);
			}

		} catch (EOFException e) {

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;

	}
}
