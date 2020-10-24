<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

out.print("Session count: "+session.getAttribute("counter")+"<br>");
out.print("Application count: "+application.getAttribute("counter")+"<br>");
%>
<div>
<a href="session.jsp">Session</a><br>
<a href= "application.jsp">Application</a>
</div>

</body>
</html>