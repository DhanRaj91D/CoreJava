package Study_PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_4 {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		ShowProductDetails(connect);
	}

	private static void ShowProductDetails(Connection connect) {

		String sql = "select ?,? from product";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the column name you want to see");
		String input1 = sc.next();
		System.out.println("Enter the column name you want to see");
		String input2 = sc.next();

		try {
			PreparedStatement pstmt = connect.prepareStatement(sql);
			pstmt.setString(1, input1);
			pstmt.setString(2, input2);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				
				String name = rs.getString("product_name");
				String date = rs.getString("product_expiry_date");

				System.out.println(name + "," + date);

			}

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
