//Write a Java Client that connects to the database and asks the user to enter a product id and 
//show the details of that product id on console . ( select query with where clause )


package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client_2Product {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		findProductByID(connect);

	}

	private static void findProductByID(Connection connect) {
		try {
			Statement stm = connect.createStatement();

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the product Id to find the product");

			int input_id = sc.nextInt();

			String sql = "Select * from product where product_id=" + input_id;

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt(1); // you can add coulumn number or colum name here which is in actual table
				String name = rs.getString(2);
				int cost = rs.getInt(3);
				String desc = rs.getNString(4);
				String date = rs.getString("product_expiry_date");
				
				System.out.println(id + ", " + name + ", " + cost + ", " + desc + ", " + date + ".");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private static Connection makeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found in given class path");
		}

		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Could bnoit connected to DB " + e);
		}

		return con;
	}

}
