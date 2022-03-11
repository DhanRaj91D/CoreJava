<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 2</title>
</head>
<body>

page level = <%=pageContext.getAttribute("greating") %><br/> <!-- page level attribute of ex 1 its sacope is for only that page so it is not working here  -->
request level=<%=request.getAttribute("wrycry") %> <br/>  <!-- due to request level scope you can use it only in same request -->
application level= <%=application.getAttribute("proverb") %> <br/><!-- application level scop so you can use it in any file from same aplplication --> 
session level= <%=session.getAttribute("country") %><br/>
</body>
</html>