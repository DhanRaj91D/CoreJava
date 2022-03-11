<%@page import="study.ProductDAO"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.persistence.criteria.CriteriaBuilder.In"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Update Quantity</h1>
<body>

  <% 
 
  
  String inp=request.getParameter("id");
  String key_value =request.getParameter("key_value");
  String value=request.getParameter("value");
  
  if(inp != null) 
  {
	  int id=Integer.parseInt(inp);
	  int key=Integer.parseInt(key_value);
	  ProductDAO pd= new ProductDAO();
	 if( pd.changeProperty(id, value, key))
	 {
	 
  %>
 <h4>Details updated Successfully</h4> 
  <%} 
	 
  } %>



<form>
Enter the product ID :<input type="number" name="id"/><br/><br/>
 <select name="key_value">
 <option value="1">Product_name</option>
  <option value="2">Product_desc</option>
   <option value="3">Expiry_date</option>
    <option value="4">Cost</option>
     <option value="5">Unit</option>
 </select> &nbsp <input type="text" name="value"/><br/><br/>
<input type="submit" value="Update"/><br/>
</form>


</body>
</html>