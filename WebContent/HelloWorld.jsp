<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <% @ page import = "com.javasb.beans.*" %>
   <%! String usr; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
<%
Object 0 = request.getSession().getAttribute("UserSession");
User user = (User)o;
%>
	<h1>Hello <%=request.getParameter("User") %></h1>
	<p><%=request.getParameter("msg") %>?</p>
</body>
</html>