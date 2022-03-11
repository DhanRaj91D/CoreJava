package study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.EmployeeDAO;
import study.entity.EmployeeEntity;


@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeEntity emp=new study.entity.EmployeeEntity();
		
		emp.setName(request.getParameter("name"));
		emp.setSalary(Integer.parseInt(request.getParameter("sal")));
		emp.setDepartment(request.getParameter("dept"));
		emp.setUname(request.getParameter("uname"));
		emp.setPassword(request.getParameter("pass"));
	
		EmployeeDAO dao=new EmployeeDAO();
		
		if(dao.addEmp(emp)) {
			
			response.setContentType("text/html");
			response.getWriter().append("<html><body>");
			response.getWriter().append("<h4>User added Sucsessfully<h4/>");
			response.getWriter().append("</html></body>");
		}
		
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
