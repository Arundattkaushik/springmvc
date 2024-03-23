<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<% 
List<String> list = (List<String>)request.getAttribute("l"); 
String s = (String) request.getAttribute("name");
%>
<h1>Hi <%=s %></h1>
<h3>You are learning MVC</h3>
<h5>About :<% for(String f:list){out.print(" "+f);}%> </h5>
</body>
</html>