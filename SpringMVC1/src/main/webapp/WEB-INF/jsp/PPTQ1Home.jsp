<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="PPTQ1Next" method="post" modelAttribute="PPTQ1Model">

Course Code: 
<form:input path="CourseCode" ></form:input>

		<form:button>Next</form:button>

	</form:form>

</body>
</html>