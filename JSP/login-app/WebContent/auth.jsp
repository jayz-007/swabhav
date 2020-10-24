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
String name = request.getParameter("name");
String password = request.getParameter("password");
if(name.equals("admin")&&password.equals("admin")){
	out.print("Login Succesful <br> Welcome admin");
}
else{
	out.print("Login failed<br>");
}
%>
</body>
</html>