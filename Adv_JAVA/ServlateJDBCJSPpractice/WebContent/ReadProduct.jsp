<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All product</title>
</head>
<body>
<%

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

String sql ="SELECT * FROM PRODUCT_TABLE";
			
			Statement stmt = connect.createStatement();
			
		ResultSet rs= stmt.executeQuery(sql);
	%><table border="1"><tr>
		<th>ID</th>
		<th>Product name</th>
		<th>Product Desc</th>
		<th>Cost</th>
		<th>Unit</th>
		<th>Expiree Date</th></tr>
		<tr><%		
		while(rs.next())
		{
			String pid=rs.getString(1);
			String pname=rs.getString(2);
			String pDesc=rs.getString(3);
			String pcost=rs.getString(4);
			String punit=rs.getString(5);
			String pEdate=rs.getString(6);
		%>
		
		<td><%=pid %></td>
		<td><%=pname%></td>
		<td><%=pDesc %></td>
		<td><%=pcost %></td>
		<td><%=punit%></td>
		<td><%=pEdate %></td>
		</tr>
		<% }%></table>


</body>
</html>