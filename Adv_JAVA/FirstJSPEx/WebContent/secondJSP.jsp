<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form method="post">
			<input type="text" name="num" />
			<button type="submit">Submit</button>
		</form>
	</div>

	<%
		String inp = request.getParameter("num");
		if (inp != null) {
			int x = Integer.parseInt(inp);
			for (int i = 0; i < x; i++) {
	%><p><%=i%> hello JSP </p>
	<%
		}
		}
	%>

</body>
</html>