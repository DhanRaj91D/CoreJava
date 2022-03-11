<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<input type="text" name="name"><br> <input type="text"
			name="cost"><br> <input type="submit" value="Insert">
	</form>

	<%
		String name = request.getParameter("name");
		String x = request.getParameter("cost");
		if(name!=null){
		int cost =Integer.parseInt(x);
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/adv_java";
		String uname = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, uname, pass);

		String sql = "Insert into bookshop(book_name,cost) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, cost);
		pstmt.executeUpdate();
		}
	%>
</body>
</html>