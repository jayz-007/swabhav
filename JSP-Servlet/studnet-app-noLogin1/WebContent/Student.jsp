<%@page import="com.techlabs.model.Student"%>
<%@page import="com.techlabs.service.StudentService"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Record</title>
</head>
<body>

	<%
		List<Student> students = (List<Student>) request.getAttribute("students");
		//Admin admin = new Admin();
		//String userName = admin.getUserName();
		//String password = admin.getPassWord();
	%>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
			</tr>
		</thead>
		<tbody>
			<!--   for (Todo todo: todos) {  -->
			<%
				for (Student student : students) {
			%>
			<tr>
				<td><%=student.getId()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getRole()%></td>
			<%} %>
			</tr>
			</tbody>
			</table>
			


</body>
</html>