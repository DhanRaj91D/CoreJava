
//4. Write a java client that shows all products in the table with following info
//		a. Product name  Expiry Date

package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client_4Product {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		ShowProductDetails(connect);

	}

	private static void ShowProductDetails(Connection connect) {

		try {
			Statement stm = connect.createStatement();

			String sql = "Select product_name,product_expiry_date from product";

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("product_name");
				String date = rs.getString("product_expiry_date");

				System.out.println(name + "," + date);
			}

			rs.close();
			stm.close();
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Connection makeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found in the given path");

		}

		Connection con = null;

		String url = "jdbc:mysql://localhost/adv_java";
		String user = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Connection not done" + e);
		}
		return con;
	}

}
