<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Book list</title>
</head>

<body>

<div>

<% List<BookEntity> book= (List<BookEntity>)request.getAttribute("books");
%>

<table border="1">
<tr><th>Book name</th></tr>
<%for(BookEntity bk : book){ %>
<tr><td><%=bk.getBookName() %></td></tr>
<%} %>
</table>

</div></body>



</html>