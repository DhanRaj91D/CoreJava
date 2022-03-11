<%@page import="study.entity.groceryEntity"%>
<%@page import="study.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View Product</h1>
<form><!--  action="show_user" -->
Enter the product ID :<input type="number" name="id"/><br/><br/>
<input type="submit" value="View"/><br/><br/>
</form>

<% 
 ProductDAO pd=new ProductDAO();
String inp=request.getParameter("id");

if(inp!=null)
{
	int id = Integer.parseInt(inp);
	groceryEntity ge = pd.showDetails(id);
	
	%>
	<h1>Product Details</h1>
	<table border="1">
	<tr><th>product_id</th>
	<th>cost</th>
	<th>Expiry_Date</th>
	<th>product_desc</th>
	<th>product_name</th>
	<th>Quantity</th></tr>
	<tr><td><%= ge.getProduct_id()%></td>
		<td><%= ge.getCost()%> </td>
		<td><%=ge.getExpiry_date()%></td>
		<td> <%=ge.getProduct_desc()%> </td>
		<td><%= ge.getProduct_name() %></td>
		<td><%= ge.getUnit()%></td></tr></table>
	
	<%
}
%>



</body>
</html>