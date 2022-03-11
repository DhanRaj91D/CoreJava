<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<form action="AddProductServlate" method="post">

Insert ID : <input type="text" name="pid" id="pid"/><br/><br/>

Enter name : <input type="text" name="pname" id="pname"/><br/><br/>

Enter Description : <input type="text" name="pDescription" id="pDescription"/><br/><br/>

Enter Price : <input type="text" name="pCost" id="pCost"/><br/><br/>

Enter unit : <input type="text" name="punit" id="punit"/><br/><br/>

Enter Expiry_date : <input type="text" name="Expiry_date" id="Expiry_date"/><br/><br/>

<input type="submit" value="Insert"/><br/><br/>

</form>


</body>
</html>