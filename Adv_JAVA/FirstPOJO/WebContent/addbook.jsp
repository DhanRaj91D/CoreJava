<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add book</title>
</head>
<body>
	<form>
		Enter Book Name: <input type="text" name="name" /><br /> Enter Cost:
		<input type="text" name="cost" /><br />
		<button type="submit">Insert</button>
	</form>
	<%
		String name = request.getParameter("name");
		String cost = request.getParameter("cost");
	
		if (name != null) {
			int co = Integer.parseInt(cost);
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/adv_java";
			String uname = "root";
			String pass = "root";

			Connection con = DriverManager.getConnection(url, uname, pass);
			//insert into bookshop(book_name,cost) values("Cpp",300);
			String sql = "insert into bookshop(book_name,cost) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, co);

			pstmt.executeUpdate();

		}
	%>



</body>
</html>