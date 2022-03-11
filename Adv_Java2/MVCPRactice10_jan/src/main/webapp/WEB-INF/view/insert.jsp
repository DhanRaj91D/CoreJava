<html>
<head>
<title>Home</title>
</head>
<body>
<form action="insert" method="post">
Enter movie Name: <input type="text" name="name" id="name"/><br/><br/>
Enter rating:<br/>
1 Star <input type="radio" name="rate" value="1"/>&nbsp
2 Star<input type="radio" name="rate" value="2"/>&nbsp
3 Star<input type="radio" name="rate" value="3"/>&nbsp
4 Star<input type="radio" name="rate" value="4"/>&nbsp
5 Star<input type="radio" name="rate" value="5"/>&nbsp<br/><br/>

Enter Catagery: <select name="catg"> 
<option>Drama</option>
<option>Horrer</option>
<option>Action</option>
<option>Comedy</option>
</select><br/><br/>

<input type="submit" value="Insert"/>&nbsp &nbsp
<input type="reset"  value="reset"/><br/><br/>
</form>
</body>
</html>