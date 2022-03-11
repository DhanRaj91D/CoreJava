//3. Write a Java Client that connects to the data base and asks the user to enter a product id and delete the row from the database.

package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Clinet_3Product {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		delectProductByID(connect);

	}

	private static void delectProductByID(Connection connect) {

		try {
			Statement stm = connect.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID you want to delete");
			int id = sc.nextInt();

			String sql = "Delete from product where product_id =" + id;

			stm.executeUpdate(sql);
			System.out.println("Deleted Sucssesfully...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Connection makeConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found in given path");
		}

		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Could not connected to DB" + e);
		}

		return con;
	}

}
