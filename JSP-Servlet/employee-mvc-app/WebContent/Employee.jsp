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

				<td><form action="EditController" method="post">
						<input type="hidden" id="emp" name="empId"
							value="<%=employee.getId() %>"> <input type="submit"
							value="edit">
					</form>
					
				<td><form action="Deletecontroller" method="post">
						<input type="hidden" id="emp" name="empId"
							value="<%=employee.getId() %>"> <input type="submit"
							value="Delete">
					</form>
			</tr>
			<%
				}
			%>
		</tbody>

	</table>

	<a href="index.html" type="button">Back</a>
	<script type="text/javascript">
		function show() {
			var id = document.getElementById("emp");
			alert(id);
		}}
	</script>
</body>
</html>