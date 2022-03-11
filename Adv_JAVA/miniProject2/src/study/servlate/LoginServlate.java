package study.servlate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import study.HibernateDAO;
import study.entity.User;

@WebServlet("/LoginServlate")
public class LoginServlate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User nuser=new User();
		nuser.setUname(request.getParameter("uname"));
		nuser.setPass(request.getParameter("pass"));
		
		System.out.println(nuser.getUname()+" "+nuser.getPass());
		HibernateDAO dao=new HibernateDAO();
		
		if(dao.validateuser(nuser))
		{
			HttpSession session= request.getSession();
			session.setAttribute("user", nuser);
			
			ServletContext context = super.getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/Welcome.jsp");
			rd.forward(request, response);
			
		}
		
		else
		{
			ServletContext context = super.getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
