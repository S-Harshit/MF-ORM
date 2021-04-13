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
	<h2>${student }</h2>

	<p>Details</p>
	<h1>Name is: ${customer.name }</h1>
	<h1>Password is: ${customer.password}</h1>
	<h1>ID is: ${customer.id}</h1>
	<h1>DOB is: ${customer.dob }</h1>
	<h1>Courses is: ${customer.courses}</h1>
	<h1>Type is: ${customer.type}</h1>
	<h1>Gender is: ${customer.gender}</h1>
	<hr>
</body>
</html>