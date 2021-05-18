<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	The customer is confirmed: ${cutomer.firstName} ${cutomer.lastName}

	<br>
	<br> Free passes: ${cutomer.freePasses}

	<br>
	<br> Postal Code: ${cutomer.postalCode}

	<br>
	<br> Course code: ${cutomer.courseCode}
	
	<br>
	<br> Course code: ${cutomer.password} 

</body>
</html>