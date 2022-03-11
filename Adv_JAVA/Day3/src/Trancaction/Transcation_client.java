package Trancaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transcation_client {
	public static void main(String[] args) throws SQLException {

		Connection connect = makeConnection();

		String sql = "update account set balance = balance + ? where ac_id=?";
		try {
			PreparedStatement pstm = connect.prepareStatement(sql);
			connect.setAutoCommit(false);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr Your account no ");
			int ac = sc.nextInt();
			System.out.println("Enetr the amount you want  to send");
			int ammount = sc.nextInt();
			int withdraw = -ammount;

			System.out.println("Enetr the account no want  to send");
			int ac2 = sc.nextInt();

			pstm.setInt(1, withdraw);
			pstm.setInt(2, ac);
			int howmanyrowsupdated = pstm.executeUpdate();

			if (howmanyrowsupdated == 0) {
				throw new SQLException();
			}

			pstm.setInt(1, ammount);
			pstm.setInt(2, ac2);
			howmanyrowsupdated = pstm.executeUpdate();
			if (howmanyrowsupdated == 0) {
				throw new SQLException();
			}

			System.out.println("Deposit Secsessfull....");
			connect.commit();
			sc.close();
			pstm.close();

		} catch (SQLException e) {

			e.printStackTrace();
			connect.rollback();

		}
		connect.close();

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
