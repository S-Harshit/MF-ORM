<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome ${customer.firstName} ${customer.lastName}</title>
</head>
<body>

	The customer is confirmed: ${customer.firstName} ${customer.lastName}


	<br>
	<br> Your Password is: ${customer.password}

</body>
</html>