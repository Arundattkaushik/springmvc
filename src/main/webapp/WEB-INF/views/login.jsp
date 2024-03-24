<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h3>Login</h3>
	<form action="loginProcessor" method="post">
		<label>UserId</label><br>
		<br> <input name="userEmail"><br>
		<br> <label>User Password</label><br>
		<br> <input name="userPassword"><br>
		<br>

		<button type="submit">Login</button>

	</form>
</body>
</html>