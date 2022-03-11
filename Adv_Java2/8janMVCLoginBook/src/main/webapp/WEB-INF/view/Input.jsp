<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
    <% String msg= (String)request.getAttribute("error");
    if(msg!=null)
    {
    %>
    <font color="red"><%=msg %></font>
    <%
    }

    %>

    <form action="verify2" method="post">
   Enter Username:  <input type="text" name="uname"/><br/><br/>
   Enter password: <input type="text" name="pass"/><br/><br/>
  <input type="submit" value="login"/> <br/><br/>
</form>
</body>
</html>