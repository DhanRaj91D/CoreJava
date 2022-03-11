<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String msg = request.getParameter("message");
	if(msg!=null){
	%>
	<font color="red"><%=msg %></font>
	
	<%} %>

	<form action="check_pelendrome.jsp">
		<input type="text" name="inp" /><br /> <input type="submit"
			value="Check pelendrome" />
	</form>


</body>
</html>