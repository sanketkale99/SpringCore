<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- <h2>Welcome to linkcode, ${uname}</h2>
	<h2>Your email is ${email}</h2>
	<h2>Your password is - ${password} try to secure the Password</h2>

	<h2>You have successfully registered..!!</h2>
	<h2>Thank You...</h2> --%>
	
	<h2>${description }</h2>
	<h2 style="color: red;">${msg }</h2>
	<hr>
	<h2>Welcome to linkcode, ${user.userName}</h2>
	<h2>Your email is ${user.email}</h2>
	<h2>Your password is - ${user.password} try to secure the Password</h2>

	<h2>You have successfully registered..!!</h2>
	<h2>Thank You...</h2>
	

</body>
</html>