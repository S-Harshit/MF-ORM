<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test.css"
    rel="stylesheet">

<title>Login</title>
</head>
<body>
<h2>Hello World! welcome ${msg}</h2>
<%-- <form action="welcome" method="post">
<input type="text" name="userid" placeholder="enter user name">
<button>login</button>
</form> --%>

<form:form action="welcome" method="post" modelAttribute="Users">

<form:input path="userId" />
<form:button>Login</form:button>



</form:form>


</body>
</html>