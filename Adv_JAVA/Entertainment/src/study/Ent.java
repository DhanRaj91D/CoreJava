package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ent extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name =request.getParameter("name");
		String[] ent1=request.getParameterValues("cb");
		
		PrintWriter pw = response.getWriter();
		
		pw.append(name + " likes ");
		for (int i = 0; i < ent1.length; i++) {
//			pw.append(ent1[i]+ " and ");
			if(i==ent1.length-1)
				pw.append(" and ");
			
			pw.append(ent1[i] + " ");
			
		}
		
		
	}

}
