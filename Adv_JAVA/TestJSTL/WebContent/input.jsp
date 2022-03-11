
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
<% 
if (session.isNew()) {
	session.setAttribute("names", new ArrayList<String>());
} else {
	String item = request.getParameter("inp");
	
	ArrayList<String> al = (ArrayList) session.getAttribute("names");
	if (al == null) {
		al = new ArrayList<String>();
	}
	al.add(item);
	session.setAttribute("names", al);
}
%>

<table>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach  items="${names }"  var="element" >  
  
  <tr>
  <c:if test="${element.length() < 5   }">
  <td>${element.toUpperCase() }</td>
  </c:if>
  <<c:if test="${element.length() > 4   }">
  <td>${element }</td>
  </c:if>
  </tr>
  
   
</c:forEach>  


</table>

<form>
<input type="text" name="inp"/><br/>
<input type="submit" value="submit"/>

</form>

</body>
</html>