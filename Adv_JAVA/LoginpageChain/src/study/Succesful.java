package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Succesful")
public class Succesful extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(); // here we create session object
		int c = 0;

		if (session.isNew()) {
			c = 1;
			session.setAttribute("count", c); // by using se attribute we can set attribute in the hasmap of session
												// object
		} else {
			c = (int) session.getAttribute("count");
			c++;
			session.setAttribute("count", c);
		}

		String uname = (String) request.getAttribute("uname"); // from last servlate we sent the attribute we collect it
																// here

		String welcome = "Welcome " + uname + " You are in Succsessfull servlet";

		response.setContentType("text/html");
		response.getWriter().append(welcome);
		response.getWriter().append("This user visited the site " + c + " times");
		response.getWriter().append("<a href='logout'>logout</a>");
	}

}
