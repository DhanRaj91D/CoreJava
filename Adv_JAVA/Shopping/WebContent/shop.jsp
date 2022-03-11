<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ol>
		<%
			if (session.isNew()) {
				session.setAttribute("cart", new ArrayList<String>());
			} else {
				String item = request.getParameter("item");
				ArrayList<String> al = (ArrayList) session.getAttribute("cart");
				if (al == null) {
					al = new ArrayList<String>();

				}
				al.add(item);
				session.setAttribute("cart", al);
				
				for (String pitem : al) {
		%>
		<li><%=pitem%></li>
		<%
			} //end of for
				
			} // end of else
		%>


	</ol>



	<form action="shop.jsp">

		Enter item you want to purchace: <select name="item">

			<option>ghee</option>
			<option>butter</option>
			<option>jacket</option>
			<option>shoes</option>
			<option>pen drive</option>
			<option>mouse</option>
			<option>sugar</option>
			<option>socks</option>
			<option>power bank</option>
			<option>tshirt</option>
			<option>tea</option>
			<option>lan cable</option>
			<option>Card</option>
			<option>mageei</option>
			<option>rin</option>  
			<option>cd</option>
			<option>pen</option>

		</select><br /> <input type="submit" value="Add to cart" />
	</form>
	
	<br /> <button><a href="bill.jsp">Bill</a></abbr></a></button>
	<jsp:forward page=""/>

</body>
</html>