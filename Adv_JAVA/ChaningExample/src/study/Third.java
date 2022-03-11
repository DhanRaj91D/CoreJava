package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Third")
public class Third extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String finalpoem=(String) request.getAttribute("line2");
		
		String poemmore=finalpoem+"up above the";
		
		response.setContentType("text/html");
		response.getWriter().append(poemmore);
		
		
		
		
	}

	

}
