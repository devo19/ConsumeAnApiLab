<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete List</title>
</head>
<body>
	<div class="container">

		<h1>Big List</h1>

		<table class="table">
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Innovation</th>
				<th>Year</th>
			</tr>

			<c:forEach items="${list}" var="person">

				<tr>
					<td>${person.firstName}</td>
					<td>${person.lastName}</td>
					<td>${person.innovation}</td>
					<td>${person.year}</td>
				</tr>


			</c:forEach>
		</table>

		<a href="/">Home</a>

	</div>

</body>
</html>