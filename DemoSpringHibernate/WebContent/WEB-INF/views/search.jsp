<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
</head>
<body>
	<div align="center">
		<h1>Customer</h1>
		<form action="search" method="get">
			<input type="text" name="keyword" />
			<input type="submit" value="Search" />	
		</form>
		<h3><a href="new" >New Customer</a></h3>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${search}" var="list" >
				<tr>
					<td> ${list.name} </td>
					<td> ${list.email} </td>
					<td> ${list.address} </td>
					<td>
						<a  href="edit?id= ${list.id}" >Edit</a>
						<a  href="delete?id= ${list.id}" >Delete</a> 
					</td>
				</tr>
			</c:forEach>
		</table>
		
	</div>
</body>
</html>