package CalleableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;


public class Callable_1 {
	public static void main(String[] args) {
		Connection connect = makeConnection();

		String sql = "{call pro7(?,?,?)}";
		try {
			CallableStatement csmt = connect.prepareCall(sql);

			csmt.registerOutParameter(3, Types.INTEGER);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 1st num");
			int num1 = sc.nextInt();
			System.out.println("Enter the 2nd num");
			int num2 = sc.nextInt();
			csmt.setInt(1, num1);
			csmt.setInt(2, num2);

			csmt.execute();

			int sum = csmt.getInt(3);
			System.out.println("Addition =" + sum);
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
			System.out.println("Could not connected to DB" + e);
		}

		return con;
	}

}
