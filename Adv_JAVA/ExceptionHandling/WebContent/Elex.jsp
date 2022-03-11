<%@page import="study.RandomNumber" %>
<html>
<head>
<title>EL example</title>
</head>
<body>


	
		application level=${applicationScope.proverb}
<br/>	request level=${wrycry}
<br/>	session level=${sessionScope.country }
<br/>	

		application level =${applicationScop.random.getRandomNumber() }
</body>
</html>