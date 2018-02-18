<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>


<html>
<style>
	.error{color:red}
</style>
<head>
<title>Student Input</title>

</head>
<body>

	<h3>Please enter your details</h3>
	<br><br/>
	<form:form action="processForm" modelAttribute="student">
	
		SurName : <form:input path="surName" />
	
		<br><br/>
	
		FirstName: <form:input path="name" />
		<form:errors path="name" cssClass="error"/>
		
		<br><br/>
		Country : 
	
		<form:select path="country">
			<form:option value="" label="Select One"/>
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="France" label="France"/>
			<form:option value="Singapore" label="Singapore"/>
			<form:option value="Denmark" label="Denmark"/>
		</form:select>
	<br><br/>
	Favourite Language : 
	
	Java <form:radiobutton path="favoriteLanguage" value="Java" />
	PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
	C# <form:radiobutton path="favoriteLanguage" value="C#" />
	
	
	<br><br/>
	Operating Systems
	
	Windows <form:checkbox path="operatingSystem" value="Windows"/>
	Linux <form:checkbox path="operatingSystem" value="Linux"/>
	Mac <form:checkbox path="operatingSystem" value="Mac"/>
	
	
	
	
	<br/>
	
	<input type="submit" value="Submit" />
	</form:form>

</body>



</html>