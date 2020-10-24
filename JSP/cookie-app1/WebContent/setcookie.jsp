

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Creating Cookies</title>
</head>
<body>
	<%
		Cookie color = new Cookie("color","red");
		color.setMaxAge(86400);
		response.addCookie(color);
		out.print("Creating cookie");
	%>
	
	<a href="getCookie.jsp">view</a>

</body>
</html>