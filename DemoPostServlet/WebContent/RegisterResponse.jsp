<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Ký</title>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
		<h1 class="text">ĐĂNG KÝ THÀNH CÔNG</h1>
	<div class="username">
		<h4>User Name : <%= request.getParameter("userName") %></h4>
	</div>
	<div class="username">
		<h4>Password : <%= request.getParameter("password") %></h4>
	</div>
	<div class="username">
		<h4>Email : <%= request.getParameter("email") %></h4>
	</div>
	<div class="username">
		<h4>BirthDay : <%= request.getParameter("birthday") %></h4>
	</div>
	<div class="username">
		<h4>Gender : <%= request.getParameter("gender") %></h4>
	</div>
	<div class="username">
		<h4>Address : <%= request.getParameter("address") %></h4>
	</div>
	<body>

</body>	
</body>
</html>