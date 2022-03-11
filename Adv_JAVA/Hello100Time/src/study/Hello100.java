package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello100 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String input=request.getParameter("hello_counter");
		
		int num=Integer.parseInt(input);
		
		response.setContentType("text.html");

		PrintWriter pw = response.getWriter();

		pw.append("<html><body>");

		for (int i = 0; i < num; i++) {
			pw.append("<p>" +i+ " Hello</p>");
		}
		pw.append("</body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
   

}
