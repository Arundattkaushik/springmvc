<%@page import="com.spring.mvc.models.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<% String name = (String) request.getAttribute("fname"); %>
<% Login login = (Login) request.getAttribute("login"); %>
<h4>Hi <%=name %> You have registred successfully</h4>
<h5> With following credentials</h5>
<h6> UserEmail: <%=login.getUserEmail() %></h6>
<h6> User Password: <%=login.getUserPassword() %></h6>
</body>
</html>