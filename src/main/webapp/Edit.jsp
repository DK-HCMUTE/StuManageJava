<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles.css">
</head>
<body>
	<form action="" method ="post" class="center">
		Student id: <input type="text" name="id" value="${student.id}" disabled> <br>
		Student name: <input type="text" name="name" value="${student.name}"> <br>
		Student email: <input type="email" name="email" value="${student.email}"> <br>
		point: <input type ="text" name ="point" value="${student.point}"> <br>
		<button type="submit">edit</button>
	</form>
</body>
</html>