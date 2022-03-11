<%@page import="study.entity.EmployeeEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome </title>
</head>
<body>
<%  EmployeeEntity emp =(EmployeeEntity) session.getAttribute("user");
%>

<h2>Welcome<%=emp.getUname() %></h2>
</body>
</html>