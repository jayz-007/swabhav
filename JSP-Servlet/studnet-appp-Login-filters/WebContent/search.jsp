<%@page import="com.techlabs.model.Student"%>
<%@page import="com.techlabs.service.StudentService"%>
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
	<h1>Search by name</h1>
	<form action="SearchByNameController" method="get">
		<label>Enter Name</label> <input type="text" name="searchByName">
		<input type="submit" value="search">
	</form>

	<%
		List<Student> students = (List<Student>) request.getAttribute("student");	;
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
				if (students != null) {
					for (Student student : students) {
			%>
			<tr>
				<td><%=student.getId()%> hey </td>
				<td><%=student.getName()%></td>
				<td><%=student.getRole()%></td>



				<%
					}
					}else
						out.print("empty");
				%>


			</tr>
		</tbody>
	</table>
	
	<form action="StudentController" method="get">
	<input type="submit" value="Go back">
	</form>

</body>
</html>