<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
	/*
			String address=(String)request.getAttribute("address");
			String pincode=(String) request.getAttribute("pincode");
			LocalDateTime time=(LocalDateTime) request.getAttribute("time");
			*/
	%>

	<h2>
		<%-- <%=address %> --%>
		<!-- Method 1 -->
	</h2>
	<h2>
		My Address is : ${address}
		<!-- Method 2 -->
	</h2>


	<h2>
		My pincode is :
		<%-- <%=pincode %> --%>
	</h2>
	<!-- Method 1 -->
	<h2>
		My pincode is : ${pincode}
		<!-- Method 2 -->
	</h2>

	<h3>
		Time is :
		<%-- <%=time %> --%>
		<!-- Method 1 -->
	</h3>
	<h3>
		Time is : ${time }
		<!-- Method 2 -->
	</h3>
	<hr>

	<!-- used jstl library for traversing list and add taglib uri above head tag in jsp file -->
	<c:forEach var="item" items="${marks }">
		<%-- <h1> ${item }</h1> --%>
		<!-- 1 -->
		<h2>
			<c:out value="${item }"></c:out>
		</h2>
		<!-- 2 -->

	</c:forEach>

</body>
</html>