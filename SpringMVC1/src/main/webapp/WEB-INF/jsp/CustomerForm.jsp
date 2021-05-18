<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Customer Registration Form</title>
</head>
<body>

	<i>Fill out the form. Asterisk (*) means required.</i>
	<br>
	<br>

	<form:form action="processForm" modelAttribute="CustomerModel">

First name: <form:input path="firstName" />
		<br>
		<br>
Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" />
		
		Free passes  (*): <form:input path="freePasses" />
		<form:errors path="freePasses" />

		<br>
		<br>

		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" />

		<br>
		<br>

		<%-- Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" /> --%>

		<br>
		<br>

		Password: <form:password path="password" />
		<form:errors path="password" />
		
		<br>
		<br>
		
		<input type="submit" value="Submit" />
	</form:form>



</body>

</html>