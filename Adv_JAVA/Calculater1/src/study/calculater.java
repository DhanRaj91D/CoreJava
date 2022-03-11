package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class calculater extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String inp1=request.getParameter("num1");
		int num1=Integer.parseInt(inp1);
		String inp2=request.getParameter("num2");
		int num2=Integer.parseInt(inp2);
		String inp3=request.getParameter("operation");
		
		
		
		PrintWriter pw=response.getWriter();
		
		if(inp3.equals("1"))
			pw.append(num1+" + "+num2+" = "+(num1+num2));
			if(inp3.equals("2"))
				pw.append(num1+" - "+num2+" = "+(num1-num2));
				if(inp3.equals("3"))
					pw.append(num1+" * "+num2+" = "+(num1*num2));
					if(inp3.equals("4"))
						pw.append(num1+" / "+num2+" = "+(num1/num2));
						
		
		
		
	}

}
