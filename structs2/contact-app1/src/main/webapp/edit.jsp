<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.techlabs.model.Contact "%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EditController" method="POST">
		<%
			Contact contact = (Contact) request.getAttribute("editContact");
		%>
		<label>Phone</label> <input type="text" name="phone"
			value="<%=contact.getPhone()%>"><br> <label>Email</label>
		<input type="text" name="email" value="<%=contact.getEmail()%>"><br>
		<input type="hidden" name="fname" value="<%=contact.getFname()%>">
		<input type="hidden" name="lname" value="<%=contact.getLname()%>">
		<input type="submit" value="Change">

	</form>
</body>
</html>