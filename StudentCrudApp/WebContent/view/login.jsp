<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<fieldset>
		<legend>Login Form</legend>
		<form action="${pageContext.request.contextPath }/login_action " method="post">
		<input type="text" name="userName" /><br><br>
		<input type="password" name="password" /><br><br>
		<input type="submit" value="save" />
		</form>
	</fieldset>

</center>
</body>
</html>