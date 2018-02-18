<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
	.error{color:red}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Input</title>
</head>
<body>


	<form:form action="processForm" modelAttribute="customer">

	SurName : 
	<form:input path="surName"/>

	<br><br/>
	GivenName : 
	<form:input path="givenName"/>
	<form:errors path="givenName" cssClass="error"/>
	
	<br><br/>
	<input type="submit" value="Enter" />
	
	</form:form>
</body>
</html>