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
  		<c:forEach var="form" items="${listStudent}" >
				First Name : ${form.firstName}<br><br>
				Last Name : ${form.lastName}<br><br>
				Email : ${form.email}
 		</c:forEach>
</body>
</html>