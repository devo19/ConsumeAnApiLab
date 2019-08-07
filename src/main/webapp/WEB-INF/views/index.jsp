<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny List</title>
</head>
<body>
	<div class="container">

		<h1>Tiny Inventor</h1>

		<table class="table">
			<tr>
				<th>Name</th>
				<th>Invention</th>
				<th>Year</th>
			</tr>

			<c:forEach items="${list}" var="person">

				<tr>
					<td>${person.name}</td>
					<td>${person.invention}</td>
					<td>${person.year}</td>
				</tr>


			</c:forEach>
		</table>
		
		<a href="/complete">Visit Larger List</a>

	</div>

</body>
</html>