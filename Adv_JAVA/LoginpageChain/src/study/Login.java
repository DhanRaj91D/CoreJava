package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	public static Connection makeConection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String password = "root";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private HashMap<String, String> users;

	public void init() {
		Connection con = makeConection();
		String sql = "Select * from book_login";

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			users = new HashMap<>();

			while (rs.next()) {
				String uname = rs.getString(1);
				String pass = rs.getString(2);

				users.put(uname, pass);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		pw.append("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Login</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "\r\n" + "<div>\r\n"
				+ "<form action=\"Login\" method=\"post\">\r\n"
				+ "Enter the User Name  <input type=\"text\" name=\"Uname\"/><br>\r\n"
				+ "Enter the pass word <input type=\"text\" name=\"Pass\"/><br>\r\n" + "\r\n"
				+ "<button type=\"submit\">Submit</button>\r\n" + "\r\n" + "\r\n" + "</form>\r\n" + "</div>\r\n"
				+ "\r\n" + "</body>\r\n" + "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.append("doPost called");

		String uname = request.getParameter("Uname"); // inthis string the input from html page is taken here
		String pass = request.getParameter("Pass");
		String checkpass = users.get(uname);// in this string we take the password from hashmap using user input uname
											// the get method gives value from the key value pair

		if (checkpass != null) { // we check that the key value pare we are searching in hashmap if not exist
									// thebn the null value come in that string so we are not going to do nythng and
									// if not null
			if (checkpass.equals(pass)) {// then check that we recovered value from hashmap is equsal to the pass
											// provided by uer
				// pw.append("Welcome " + uname + "");

				request.setAttribute("uname", uname); // if yes then send the uname in request of servlate for next
														// servalate

				ServletContext context = super.getServletContext(); // go in servlate context to find the other servlate
				RequestDispatcher rd = context.getRequestDispatcher("/Succesful"); // the other servlate refrance given
																					// here
				rd.forward(request, response);// here we pas sthe request response to the next servlate
			} else {
				// String wrongpass ="You are not allowed!!";
				// request.setAttribute("wrongpass", wrongpass);
				ServletContext context = super.getServletContext();
				RequestDispatcher rd = context.getRequestDispatcher("/Failed");
				rd.forward(request, response);
			}

		}

		pw.close();
	}

}
