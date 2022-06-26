<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles.css">
</head>
<body>
	<a href="add">Add Student</a>
	<table class="center">  
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Point</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr> 
		<c:forEach items="${students}" var ="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
				<td>${s.email}</td>
				<td>${s.point}</td>
				<td><a href="#" onclick ="openWindow(this)">Edit</a></td>
				<td><a href="#" onclick="getCellValue(this)" id="delete">Delete</a></td>
			</tr>
		</c:forEach>	
		
	</table>
	
	<script type="text/javascript">
		function getCellValue(obj){
			 alert(obj.parentNode.parentNode.cells[0].textContent);
			 var id = obj.parentNode.parentNode.cells[0].textContent;
			 document.getElementById("delete").href="delete?id="+id;
		}
		function openWindow(obj){
			var id = obj.parentNode.parentNode.cells[0].textContent;
			window.open("edit?id="+id, "", "width=600,height=150");
		}
	</script>
</body>
</html>