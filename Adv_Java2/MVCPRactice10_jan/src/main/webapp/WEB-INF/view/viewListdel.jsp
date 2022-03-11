<%@page import="study.entity.MovieEntity"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Select Movie</title>
</head>
<body>

<form action="deletebyname1">

<%
  List<MovieEntity> list = (List<MovieEntity>)request.getAttribute("movielist");

%><Select name="name">

<%if(list!=null){
for(MovieEntity mv:list)
	{%>
<option><%=mv.getName()%></option>     

<%} }%>
</Select>

<input type="submit" value="ok"/>

</form>
</body>
</html>