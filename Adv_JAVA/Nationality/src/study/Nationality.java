package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Nationality extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("name");
		String nationality=request.getParameter("nation");
		
		PrintWriter pw = response.getWriter();
		
		pw.append(name + " is having "+ nationality +" nationality.");
		
		
	}

}
