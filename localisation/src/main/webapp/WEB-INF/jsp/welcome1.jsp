<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdmissionPage</title>
</head>
<body>
	<h2>${welcome_msg}</h2>
	<br>

	<hr />
	<form:form action="init2" modelAttribute="welcome">
		<spring:message code="welcome.name" />
		<form:input path="name" />
		<spring:message code="welcome.pass" />
		<form:input path="pass" />
		<form:button>Submit</form:button>
	</form:form>
	<a id="en" href="/SpringMVC2/init1?lang=en">English</a> |
	<a id="fr" href="/SpringMVC2/init1?lang=fr">French</a>
	<div>&nbsp;</div>

	<div id="welcome_text">
		<h4>
			<spring:message code="welcome.message" />
		</h4>
	</div>
</body>
</html>