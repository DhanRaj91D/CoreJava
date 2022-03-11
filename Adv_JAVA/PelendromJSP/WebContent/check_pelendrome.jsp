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
		String inp = request.getParameter("inp");
		StringBuffer sb = new StringBuffer(inp);
		sb.reverse();
		if (inp.equals(sb.toString())) {
	%>

	<jsp:forward page="welcome.jsp" />
	<%
		} else {
	%>
	<jsp:forward page="one.jsp">
		<jsp:param value="not a pelendrome try again" name="message" />
	</jsp:forward>

	<%
		}
	%>
</body>
</html>