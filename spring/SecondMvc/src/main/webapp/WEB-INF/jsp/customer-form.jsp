<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Customer Registration Form</title>

<style>
.error {
	color: red
}
</style>

</head>
<body>

	<i>Fill out the form. Asterisk (*) means required.</i>
	<br>
	<br>

	<form:form action="processForm" modelAttribute="cutomer">

		First name: <form:input path="firstName" />
		<br>
		<br>
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		Free passes  (*): <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />

		<br>
		<br>

		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />

		<br>
		<br>
		Postal Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		
			Password: <form:input path="password"/>
		<form:errors path="password" cssClass="error" />
		<%-- 	<div class="form-group">
				<form:errors path="courseCode" cssClass="error" />
			<label for="exampleFormControlSelect1">Select Courses</label><select
				name="courseCode" class="form-control"
				id="exampleFormControlSelect1" multiple>
				<option>CSE</option>
				<option>ECL</option>
				<option>CSL</option>
				<option>SOM</option>
				<option>SOT</option>
			</select>
		</div> --%>

		<br>
		<br>
	
		
		<br>
		<br>

		<input type="submit" value="Submit" />
	</form:form>
</body>

</html>
