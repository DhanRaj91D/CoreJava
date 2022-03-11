<%@page import="study.entity.MovieEntity"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>All Movie</title>
</head>
<body>

<%
  List<MovieEntity> list = (List<MovieEntity>)request.getAttribute("movie");

%><table border="1">

<tr><th>ID</th><th>Movie name</th><th>Rating</th><th>Catagery</th></tr>

<%if(list!=null){
for(MovieEntity mv:list)
	{%>
<tr><td><%=mv.getId()%></td><td><%=mv.getName()%></td><td><%=mv.getRating() %></td><td><%=mv.getCatagery() %></td></tr>

<%} }%>
</table>

</body>
</html>