
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<String> list = Arrays.asList("red","blue","black","white");

request.setAttribute("colour", list);
%>
		
		${colour }<br/>
		${colour[1]}<br/>
		${3>2}<br/>
		${4+2 }<br/>
		
		
		
		<table>
		<!--  From jar file you can youse some pre defined tags like for each if else etc -->
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!--This url is fix   -->
		<c:forEach items="${colour}" var="col">
		<tr>
		<td>${col.toUpperCase()}</td>
		</tr>
		
		</c:forEach>
		
		
		</table>

</body>
</html>