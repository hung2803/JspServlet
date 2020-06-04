<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
.btn-danger {
	margin-left: 80px;
	margin-top: 30px;
}

.table {
	margin-top: 50px;
}

body {
	background-image: url("hinhnen2.jpg");
	background-size: 1500px 700px;
}
</style>
</head>
<body>
	<a href="Insert.html"><button type="button" class="btn btn-danger">Add
			Student</button></a>
	<table class="table table-hover table-dark ">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="list" items="${listStudent}">
				<tr>
					<td><c:out value="${list.id }" /></td>
					<td><c:out value="${list.firstName }" /></td>
					<td><c:out value="${list.lastName }" /></td>
					<td><c:out value="${list.email }" /></td>
					<td><a href="Delete?id=<c:out value='${list.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>