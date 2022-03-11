<%@page import="study.dao.BookPojo"%>
<%@page import="study.dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form>
		Enter the book ID: <input type="text" name="book_id" /><br /> <input
			type="submit" value="show book info" />
	</form>

	<%
		String bid = request.getParameter("book_id");

		if (bid != null)

		{
			int id = Integer.parseInt(bid);
			BookDao dao = new BookDao();
			BookPojo pojo = dao.getBookinfo(id);
	%>
	<%=pojo%>
	<%
		} //end of if
	%>



</body>
</html>