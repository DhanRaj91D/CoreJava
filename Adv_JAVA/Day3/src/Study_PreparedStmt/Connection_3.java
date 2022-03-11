package Study_PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_3 {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		delectProductByID(connect);
	
	}

	private static void delectProductByID(Connection connect) {

		String sql = "Delete from product where product_id=?";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id to ddelelt the record");
		int id = sc.nextInt();

		try {
			PreparedStatement pstmt = connect.prepareStatement(sql);

			pstmt.setInt(1, id);

			pstmt.executeUpdate();
			sc.close();
			pstmt.close();
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
