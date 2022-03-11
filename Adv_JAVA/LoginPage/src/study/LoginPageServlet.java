package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPageServlet extends HttpServlet {

	public static Connection makeConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, user, password);

		return con;

	}

	private HashMap<String, String> users;

	public void init() {

		try {
			Connection con = makeConnection();
			String sql = "Select * from book_login";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			users = new HashMap<>();
			while (rs.next()) {
				String uid = rs.getString(1);
				String pass = rs.getString(2);
				users.put(uid, pass);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("Uname");
		String pass = request.getParameter("Pass");
		String checkpass = users.get(uname);

		PrintWriter pw = response.getWriter();

		if (checkpass != null) {
			if (checkpass.equals(pass)) {
				pw.append("Welcome " + uname + "");
			} else {
				pw.append("You are not allowed!!");
			}

		}

		pw.close();

	}

}
