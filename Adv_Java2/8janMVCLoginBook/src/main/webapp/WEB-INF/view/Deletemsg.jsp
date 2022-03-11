<html>
<head>
<title>Delete msg</title>
</head>

<body>
<% String msg =(String)request.getAttribute("msg");
if(msg!=null)
	{%><font color="red"><%= msg %></font>
	<% }%>
</body>
</html>