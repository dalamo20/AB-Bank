<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
	<h1>Hello <%=request.getParameter("User") %></h1>
	<p><%=request.getParameter("msg") %>?</p>
</body>
</html>