<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentInfo</title>
</head>
<body>
Successfully Added : <%= request.getAttribute("stuff") %>
<br>
<form action="getStudent">
<input type="submit" value="View Student"/>
</form>

</body>
</html>