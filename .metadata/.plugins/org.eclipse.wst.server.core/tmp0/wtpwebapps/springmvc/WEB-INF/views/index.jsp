<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h2>Home page called by Controller when fires /home</h2>

	<%
	String name = (String) request.getAttribute("name");
	List<String> friends = (List) request.getAttribute("friends");
	%>
	<h1>
		Name is
		<%=name%></h1>
	<h2>
		Friends are
		<%=friends%></h2>
</body>
</html>