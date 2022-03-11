<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
</head>
<body>

<form action="SignupServlet">

Enter firstname:<input type="text" name="name" id="name"/><br/><br/>
Enter Salary:<input type="text" name="sal" id="sal"/><br/><br/>
Enter Department: <input type="text" name="dept" id="dept"/><br/><br/>
User Name: <input type="text" name="uname" id="uname"/><br/><br/>
Password: <input type="text" name="pass" id="pass"/><br/><br/>

<input type="submit" value="Signup"/>&nbsp
<input type="reset" value="Reset"/>
</form>
</body>
</html>