<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Jsp</title>
</head>
<body>
	<% Cookie ck=new Cookie("name", "Dhanraj"); // here we added key value pair in coookie object 
		response.addCookie(ck); // we added that cookie in responce we can access this only in refrenced page not any other 
	%>
	<a href="second.jsp">click</a>
</body>
</html>