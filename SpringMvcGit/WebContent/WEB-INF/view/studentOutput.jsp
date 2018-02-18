
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<title>Student Form</title>
</head>
<body>

	StudentName is ${student.surName}  ${student.name} from ${student.country}
	<br></br>
	Student Favourite Language is ${student.favoriteLanguage}
	<br></br>
	
	Operating Systems :
	
	<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
		<li>${temp}</li>
	</c:forEach>
	</ul>
</body>
</html>