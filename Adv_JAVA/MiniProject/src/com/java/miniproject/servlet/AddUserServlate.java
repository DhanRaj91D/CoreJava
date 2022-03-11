package com.java.miniproject.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.miniproject.DBManager;
import com.java.miniproject.pojo.User;



@WebServlet("/AddUserServlate")
public class AddUserServlate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//using pojo class
		User newuser=new User();
		newuser.setUname(request.getParameter("uname"));
		newuser.setPass(request.getParameter("pass"));
		newuser.setFname(request.getParameter("fname"));
		newuser.setLname(request.getParameter("lname"));
		newuser.setMobile(request.getParameter("mob"));
		
		
		//fetching data coming from HTML/jsp
		//old method
//		String uname= request.getParameter("uname");
//		String pass=request.getParameter("pass");
//		String fname=request.getParameter("fname");
//		String lname=request.getParameter("lname");
//		String email=request.getParameter("email");
//		String mobile=request.getParameter("mob");
		
		
		
		DBManager db=new DBManager();
		db.createUser(newuser);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
