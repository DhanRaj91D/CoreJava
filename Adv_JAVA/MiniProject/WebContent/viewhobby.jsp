 <%@page import="com.java.miniproject.pojo.Hobby"%>
<%@page import="com.java.miniproject.pojo.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.miniproject.DBManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
View hobby
<% 

User nuser=(User)session.getAttribute("user"); 
	String user_name=nuser.getFname()+" "+nuser.getLname();
	Hobby hb= new Hobby();
	hb.setHobby_uid(nuser.getId());
	DBManager mgr= new DBManager();
	ArrayList<String> list= mgr.viewHobby(hb);
%>

Welcome <%= user_name %>

<table border="1">
<tr><th>Hobbies</th></tr>
<%for(String Hlist : list)
{
	%><tr><td><%= Hlist %></td></tr><%
}

%>
<tr></tr>
</table>


</body>
</html>