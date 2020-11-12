<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style >
tr:hover{
background-color:#ffd500;
}
</style>
</head>
<body style="background-color: #e6ffec">
	<nav class="navbar navbar-dark bg-primary">
	<h1 class="navbar-brand">Employee Info</h1>
	</nav>
	
	<table class="table">
		<thead class="thead-dark">
			<tr>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Designation</th>
				<th scope="col">Salary</th>
				<th scope="col">Age</th>
				<th scope="col">Rating</th>
				
			
			</tr>
		</thead>
		<s:iterator value="employeeRepository">
			<tbody style="background-color: #e6ffec">
				<tr>

					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="designation" /></td>
					<td><s:property value="salary" /></td>
					<td><s:property value="age" /></td>
					<td><s:property value="rating" /></td>
				</tr>
			</tbody>
		</s:iterator>
		</table>
</body>
</html>