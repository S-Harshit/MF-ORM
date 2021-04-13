<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test.css"
    rel="stylesheet">
<title>Login Page</title>
</head>
<body>
	<h1>Welcome Harshit</h1>
	<form:form action="now" method="post" modelAttribute="model">
 			Enter Student Name: <form:input path="name" />
			Enter Student id: <form:input path="id" />
		<form:button>Login</form:button>
	</form:form>
</body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
		<h2>Hello World! welcome ${msg }</h2>

                                             
	<form:form action="now" method="post" modelAttribute="model">
	EmpName: <form:input path="name" />
		Name: <form:input path="id" />
		<!-- 	
		<input type="text" name="name" placeholder="enter user name">
		<input type="text" name="id" placeholder="enter user pwd">
 -->
		<button>login</button>
	</form:form>
</body>

</html> 
--%>