<%@page import="java.util.List"%>
<%@page import="com.techlabs.model.Employee"%>
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
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
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
				for (Employee employee : employees) {
			%>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getRole()%></td>

			
			</tr>
			<%
				}
			%>
		</tbody>

	</table>

<form action="LogoutController" method="get">
		<input type="submit" value="Logout">
	</form>
</body>
</html>