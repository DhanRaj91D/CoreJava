package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client_5Product {
	public static void main(String[] args) {

		Connection connect = makeConnection();
		updateDescriptionbyId(connect);

	}

	private static void updateDescriptionbyId(Connection connect) {
		
		try {
			Statement stm = connect.createStatement();
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter ID ");
			int id=sc.nextInt();
			System.out.println("Enter the Description");
			sc.next();
			String desc=sc.nextLine();
			String sql="update product set product_desc = "+desc+" where product_id = "+id;
			stm.executeUpdate(sql);
			System.out.println("product_desc Updated Succesfully");
			
			
		} catch (SQLException e) {
			System.out.println();
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
