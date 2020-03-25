<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${anindita}
<h1>insert details here</h1>
<form action="update" method="post">
Id:<input type="text" name="id"/><br>
Name:<input type="text" name="name"/>
<input type="submit" name="submit" value="UPDATE"/>
</form>
</body>
</html>