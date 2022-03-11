package Study_PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_1 {

	public static void main(String[] args) {
		Connection connect = makeConnection();
		insertProduct(connect);

	}

	private static void insertProduct(Connection connect) {

		String sql = "Insert into product values(?,?,?,?,?)";

		try {
			PreparedStatement pstmt = connect.prepareStatement(sql);

			Scanner sc = new Scanner(System.in);

			boolean flag = true;
			while (flag) {

				System.out.println("Enter the product Id ");
				int id = sc.nextInt();

				System.out.println("Enter the product name :");
				String name = sc.next();

				System.out.println("Enter the product cost :");
				int cost = sc.nextInt();

				sc.nextLine();
				System.out.println(" Enter the product descriptin :");
				String desc = sc.nextLine();

				System.out.println("Enter the date ");
				String date = sc.next();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, cost);
				pstmt.setString(4, desc);
				pstmt.setString(5, date);

				pstmt.executeUpdate();
				System.out.println("Dis you want to add more yes/no");
				String input = sc.next();
				if (input.equalsIgnoreCase("no")) // for end the loop
					flag = false;

			}
			sc.close();
			pstmt.close();
			connect.close();

		} catch (SQLException e) {

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

			e.printStackTrace();
		}

		return con;
	}

}
