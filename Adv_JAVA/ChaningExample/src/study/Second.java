package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Second")
public class Second extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String finalstr=(String)request.getAttribute("line1");

		String secondpoem=finalstr + "How i wonder what you are ";
		request.setAttribute("line2", secondpoem);

		
		RequestDispatcher rd=super.getServletContext().getRequestDispatcher("/Third");
		rd.forward(request, response);
	}

}
