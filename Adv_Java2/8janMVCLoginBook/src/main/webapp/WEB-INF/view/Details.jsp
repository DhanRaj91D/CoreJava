<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<html>

<head>
<title>Details</title>
</head>
<body>

<div>

<% List<BookEntity> details= (List<BookEntity>)request.getAttribute("details");
if(details!=null)
{
%>
<table border="1">
<tr><th>Book ID</th><th>Book name</th><th>Cost</th></tr>
<%for(BookEntity bk1 : details){ %>
<tr><td><%=bk1.getID() %></td><td><%=bk1.getBookName() %></td><td><%=bk1.getCost() %></td></tr>
<%} }%>
</table>

</div>
</body>

</html>