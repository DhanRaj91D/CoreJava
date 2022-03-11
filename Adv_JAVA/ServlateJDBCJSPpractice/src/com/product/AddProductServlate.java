package com.product;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddProductServlate")
public class AddProductServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ProductId= request.getParameter("pid");
		String Productname= request.getParameter("pname");
		String ProductDesc= request.getParameter("pDescription");
		String ProductPrice= request.getParameter("pCost");
		String ProductUnit= request.getParameter("punit");
		String ProductEdate= request.getParameter("Expiry_date");

		/*response.getWriter().append(ProductId+" "+Productname+" "+ProductDesc+" "+ProductPrice+" "+ProductUnit+" "+ProductEdate);
	System.out.println(ProductId+" "+Productname+" "+ProductDesc+" "+ProductPrice+" "+ProductUnit+" "+ProductEdate);*/
		Connection connect=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");
			System.out.println("DB connection sucsessfull");
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		}

		try {

			String sql= "INSERT INTO PRODUCT_TABLE VALUES("+ProductId+",'"+Productname+"','"+ProductDesc+"',"+ProductPrice+","+ProductUnit+",'"+ProductEdate+"')";	
			Statement stmt =connect.createStatement();
			stmt.executeUpdate(sql);
			
			response.sendRedirect("sucess.jsp");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
