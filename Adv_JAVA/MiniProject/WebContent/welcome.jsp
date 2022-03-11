
<%@page import="com.java.miniproject.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<% 

//String name=(String)session.getAttribute("user"); 
  User nuser=(User)session.getAttribute("user"); 
	String user_name=nuser.getFname()+" "+nuser.getLname();
%>
Welcome <%= user_name %>

<br/>
<button><a href="addhobby.jsp">Add Hobby</a></button>
<button><a href="viewhobby.jsp">view Hobby</a></button>
<button><a href="signOut"> Sign-out</a></button>
</body>
</html>