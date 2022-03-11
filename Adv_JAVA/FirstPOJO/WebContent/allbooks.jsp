<%@page import="study.dao.BookPojo"%>
<%@page import="java.util.List"%>
<%@page import="study.dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All books</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>Book ID</th>
				<th>Book Name</th>
				<th>Book Cost</th>
			</tr>
		</thead>

		<tbody>

			<%
				BookDao dao = new BookDao();
				List<BookPojo> list = dao.getAllBooks();
				for(BookPojo bp : list)
				{
			%>
			
			<tr><td><%=bp.getBookid() %></td><td><%=bp.getBookcost() %></td><td><%=bp.getBookname() %></td></tr>
			<% } //end of for loop %>
		</tbody>


	</table>


</body>
</html>