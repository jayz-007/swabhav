<%@page import="com.techlabs.model.Admin"%>
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
	<form action="EmployeeController" method="get">
		<input type="submit" value="Get Employees">
	</form>

	<form action="AddEmployeePageController" method="get">
		<input type="submit" value="Get Employees">
	</form>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
		Admin admin = new Admin();
		String userName = admin.getUserName();
		String password = admin.getPassWord();
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
				<%
					if (request.getSession().getAttribute("useName").equals(userName)
								&& request.getSession().getAttribute("password").equals(password))
					{
				%>
				<td><form action="EditController" method="post">
						<input type="hidden" id="emp" name="empId"
							value="<%=employee.getId()%>"> <input type="submit"
							value="edit">
					</form>
				<td><form action="Deletecontroller" method="post">
						<input type="hidden" id="emp" name="empId"
							value="<%=employee.getId()%>"> <input type="submit"
							value="Delete">
					</form>
					<%} %>
			</tr>
			<%
				}
			%>
		</tbody>

	</table>
	<%if (request.getSession().getAttribute("useName").equals(userName)
			&& request.getSession().getAttribute("password").equals(password))
{ %>
		<form action="LogoutController" method="get">
		<input type="submit" value="Logout">
	</form>
	<%} %>
	
	<form action="LogoutController" method="get">
		<input type="submit" value="Login">
	</form>


</body>
</html>