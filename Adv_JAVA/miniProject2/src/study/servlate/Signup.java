package study.servlate;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import study.HibernateDAO;
import study.entity.Hobby;
import study.entity.User;

@WebServlet("/Signup")
public class Signup extends HttpServlet {

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User nuser= new User();
		
		nuser.setName(request.getParameter("name"));
		nuser.setEmail(request.getParameter("email"));
		nuser.setUname(request.getParameter("uname"));
		nuser.setPass(request.getParameter("pass"));
		
		Set<Hobby> hobbies =new HashSet<>();
		
		if(request.getParameter("hobby1").length()>0)
		{
			Hobby hb= new Hobby();
			hb.setHobby(request.getParameter("hobby1"));
			hb.setUserid(nuser);
			hobbies.add(hb);
		
		}
		
		if(request.getParameter("hobby2").length()>0)
		{
			Hobby hb1= new Hobby();
			hb1.setHobby(request.getParameter("hobby2"));
			hb1.setUserid(nuser);
			hobbies.add(hb1);
		
		}
		
		
		if(request.getParameter("hobby3").length()>0)
		{
			Hobby hb2= new Hobby();
			hb2.setHobby(request.getParameter("hobby3"));
			hb2.setUserid(nuser);
			hobbies.add(hb2);
		
		}
		
		nuser.setHobbies(hobbies);
		HibernateDAO dao=new HibernateDAO();
		dao.AddUser(nuser);
		
		response.sendRedirect("index.jsp");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
