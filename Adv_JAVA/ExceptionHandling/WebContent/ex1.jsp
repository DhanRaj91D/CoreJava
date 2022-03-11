<%@page import="study.RandomNumber"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 1</title>
</head>
<body>

	<%
	application.setAttribute("random", new RandomNumber(20));
	pageContext.setAttribute("greating", "Good morning"); //We set the page level attribute here 
	  request.setAttribute("wrycry", "hows the josh");
	application.setAttribute("proverb", "work while u work and play u play");
	session.setAttribute("country", "India");
	%>

	page level =<%=pageContext.getAttribute("greating") %><br/> <!-- we used page level atribute here  and it is working for the same page only --> 
	request level=<%=request.getAttribute("wrycry") %><br/>
	application level= <%=application.getAttribute("proverb") %><br/> <!-- the scop is application level so you can access it in any other file also  -->
	session level= <%=session.getAttribute("country") %><br/> <!-- Only work if the session started if witout sesson started then give error -->

<jsp:forward page="Elex.jsp"/>

</body>
</html>