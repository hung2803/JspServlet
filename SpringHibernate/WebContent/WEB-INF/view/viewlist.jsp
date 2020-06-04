<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>PhoneNumber</th>
			<th>Address</th>
		</tr>
		<tr>
			<c:forEach items="${ listStudent}" var="list" >
				<td>${list.firstName }</td>
				<td>${list.lastName }</td>
				<td>${list.email}</td>
				<td>${list.phone }</td>
				<td>${list.address }</td>
			
			</c:forEach>
		</tr>
	
	</table>
</body>
</html>