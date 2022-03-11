package com.java.miniproject.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.miniproject.DBManager;
import com.java.miniproject.pojo.Hobby;
import com.java.miniproject.pojo.User;


@WebServlet("/addHobby")
public class addHobby extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		User currUser=(User)session.getAttribute("user");
		
		Hobby hb=new Hobby();
		hb.setHobby_name(request.getParameter("hobby"));
		hb.setHobby_uid(currUser.getId() );
		DBManager mgr=new DBManager();
		mgr.addHobby(hb);
		
		response.sendRedirect("welcome.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
