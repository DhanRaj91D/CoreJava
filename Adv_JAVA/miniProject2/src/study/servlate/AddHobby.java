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

import org.hibernate.Session;

import study.HibernateDAO;
import study.entity.Hobby;
import study.entity.User;


@WebServlet("/AddHobby")
public class AddHobby extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session =request.getSession();
		User curruser= (User) session.getAttribute("user");
		
		Set<Hobby> hobbies =new HashSet<>();
		
		if(request.getParameter("hobby1")!=null)
		{
			Hobby hb1 = new Hobby();
			hb1.setHobby(request.getParameter("hobby1"));
			hb1.setUserid(curruser);
			hobbies.add(hb1);
		}
		
		if(request.getParameter("hobby2")!=null)
		{
			Hobby hb2 = new Hobby();
			hb2.setHobby(request.getParameter("hobby2"));
			hb2.setUserid(curruser);
			hobbies.add(hb2);
		}
		if(request.getParameter("hobby3")!=null)
		{
			Hobby hb3 = new Hobby();
			hb3.setHobby(request.getParameter("hobby3"));
			hb3.setUserid(curruser);
			hobbies.add(hb3 );
		}
		
		curruser.setHobbies(hobbies);
		HibernateDAO dao = new HibernateDAO();
		dao.AddUser(curruser);
		response.sendRedirect("Welcome.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
