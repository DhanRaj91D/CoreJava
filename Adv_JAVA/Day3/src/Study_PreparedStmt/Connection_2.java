package Study_PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_2 {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		findProductByID(connect);

	}
	
	private static void findProductByID(Connection connect) {
		String sql = "Select * from product where product_id=?";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the product Id to find details ");
		int id = sc.nextInt();

		try {
			PreparedStatement pstmt = connect.prepareStatement(sql);

			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int pro_id = rs.getInt(1); // you can add coulumn number or colum name here which is in actual table
				String name = rs.getString(2);
				int cost = rs.getInt(3);
				String desc = rs.getNString(4);
				String date = rs.getString("product_expiry_date");

				System.out.println(pro_id + ", " + name + ", " + cost + ", " + desc + ", " + date + ".");

			}

			sc.close();
			pstmt.close();
			connect.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
