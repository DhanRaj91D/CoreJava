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

<form action="viewbook">
<select name="bookname">
<%for(BookEntity bk : book){ %>
<option><%=bk.getBookName() %></option>
<%} %>
</select>
<input type="submit" value="Show details"/>
</form>
</div>

</body>



</html>