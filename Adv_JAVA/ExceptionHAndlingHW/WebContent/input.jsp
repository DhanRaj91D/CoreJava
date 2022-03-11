<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form>

	<input type="text" name="num"/><br/>
	<input type="submit" value="submit"/>
	
		</form>
		
		<% 
		String inp= request.getParameter("num");
		int num=0,res=0;
		if(inp!=null){
		num= Integer.parseInt(inp);
		res =num*num;%>
	<b>Square of <%=num %>	is = <%=res %></b>
		<%} %>
	


</body>
</html>