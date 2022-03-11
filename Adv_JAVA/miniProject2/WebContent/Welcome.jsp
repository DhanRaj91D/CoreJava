<%@page import="study.entity.User"%>
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


	User user=(User)session.getAttribute("user");
	String uname=user.getUname();



%>

<b>Welcome <%= uname%></b>

<br/>

<a href="addhobby.jsp">add hobby</a><br/>
<a href="ViewHobby.jsp">view hobby</a><br/>
<a href="Signout">signout</a><br/>



</body>
</html>