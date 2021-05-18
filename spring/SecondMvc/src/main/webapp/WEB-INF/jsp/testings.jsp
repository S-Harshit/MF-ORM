<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test.css" rel="stylesheet">



<title>Q3 Home</title>
</head>
<body>
	<center>
		<img width="375" height="275"
			src="resources/images/download.jpg" />
	</center>
	<h2>Enter Details</h2>



	<form:form action="display" method="post" modelAttribute="Q3Model">



Name: <form:input path="name" />&nbsp &nbsp &nbsp &nbsp
Age: <form:input path="age" />&nbsp &nbsp &nbsp &nbsp
Number: <form:input path="number" />&nbsp &nbsp &nbsp &nbsp <br>
		<br>
Password: <form:password path="password" />&nbsp &nbsp &nbsp &nbsp
Address: <form:input path="address" />&nbsp &nbsp &nbsp &nbsp
Gender: Male <form:radiobutton path="gender" value="Male" />
Female <form:radiobutton path="gender" value="Female" />&nbsp &nbsp &nbsp &nbsp
Course:<form:select path="course">
			<form:option value="CSE" label="CSE" />
			<form:option value="LLB" label="LLB" />
			<form:option value="BCOM" label="BCOM" />
		</form:select>
		<br>
		<br>
		<form:button>Add</form:button>





	</form:form>




</body>
</html>

