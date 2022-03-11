package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/First")
public class First extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String poem ="Twinkel twinkle";
		request.setAttribute("line1", poem);
		
		ServletContext context = super.getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/Second");
		rd.forward(request, response); 
	}

}
