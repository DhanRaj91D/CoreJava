package Study_PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_5 {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		updateDescriptionbyId(connect);

	}

	private static void updateDescriptionbyId(Connection connect) {

		String sql = "update product set product_desc = ? where product_id = ?";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID ");
		int id = sc.nextInt();

		System.out.println("Enter the Description");
		sc.nextLine();
		String desc = sc.nextLine();

		PreparedStatement pstmt;
		try {
			pstmt = connect.prepareStatement(sql);
			pstmt.setString(1, desc);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			System.out.println("product_desc Updated Succesfully");

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
			System.out.println("Driver class not found in the selected path");

		}

		Connection con = null;

		String url = "jdbc:mysql://localhost/adv_java";
		String user = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
