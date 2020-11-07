<%@page import="com.techlabs.service.UserService"%>
<%@page import="com.techlabs.model.Student"%>
<%@page import="java.util.List"%>
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
		List<Student> students = (List<Student>) request.getAttribute("students");
	%>

	<%
		if (UserService.checkAdmin(request)) {
	%>
	<h1>Welcome Admin</h1>
	<a href="/student-app/AddStudent">Add</a>
	<a href="Logout">Logout</a>
	<%
		} else {
	%>
	<h1>Welcome User</h1>
	<a href="/student-app/auth">Login</a>
	<%
		}
	%>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
			<%
				if (UserService.checkAdmin(request)) {
			%>
			<th>Edit</th>
			<th>Delete</th>
			<%
				}
			%>
		</tr>
		<%
			for (Student student : students) {
		%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getGender()%></td>
			<%
				if (UserService.checkAdmin(request)) {
			%>
			<td><form method="GET" action="/student-app/EditController">
					<input type="hidden" name="edit" value="<%=student.getId()%>">
					<input type="submit" value="edit">
				</form></td>
			<td><form method="GET" action="/student-app/deleteController"
					onsubmit="return confirm('Do you really want delete?');">
					<input type="hidden" name="delete" value="<%=student.getId()%>">
					<input type="submit" value="delete">

				</form></td>
			<%
				}
			%>
		</tr>

		<%
			}
		%>
	
</body>
</html>