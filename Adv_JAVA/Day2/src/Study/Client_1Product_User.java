
//1. 
//Create the table from mysql client-------------
//Product table 
//Columns ---product_id, product_name, product_cost, product_desc, product_expiry_date
//			
//Write a Java Client that connects to the database and 
//inserts records into product table in a loop, till user says  "yes"

package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client_1Product_User {

	public static void main(String[] args) {

		Connection connect = makeConnection();
		insertProduct(connect);

	}

	private static void insertProduct(Connection connect) {

		try {
			Statement stm = connect.createStatement();

			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			while (flag) {
				System.out.println(
						"Enter the product ID,product_name,product_cost,product_desc,product_expiray_date in comma se4perated frormat");
				String input = sc.nextLine();

				if (input.equalsIgnoreCase("yes")) // for end the loop
					flag = false;

				String[] values = input.split(",");

				
				
				String sq2 = "insert into product values(" + values[0] + "," + values[1] + "," + values[2] + ","
						+ values[3] + ",'" + values[4] + "')";

				stm.executeUpdate(sq2);
				System.out.println("Record inserted sucessfully..");

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public static Connection makeConnection() {  // to mnake connection 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class not found in given classPath");
		}

		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String password = "root";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Couldnot connect to DB" + e);
		}

		return con;

	}

}
