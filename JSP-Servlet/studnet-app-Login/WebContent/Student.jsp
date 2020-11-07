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
	<%if(request.getSession().getAttribute("userName")==null&&request.getSession().getAttribute("password")==null){ %>
	<h1>Welcome Guest</h1>
		<%} %>
		
			<%if(request.getSession().getAttribute("userName")!=null&&request.getSession().getAttribute("password")!=null){
			if(request.getSession().getAttribute("userName").equals("admin")&&request.getSession().getAttribute("password").equals("admin")){ %>
		<h1>Welcome admin</h1>
		
		<form action="AddStudentPageController" method="get">
		<input type="submit" value="Add">
		</form>
		<%}} %>

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
				
					<%if(request.getSession().getAttribute("userName")!=null&&request.getSession().getAttribute("password")!=null){
			if(request.getSession().getAttribute("userName").equals("admin")&&request.getSession().getAttribute("password").equals("admin")){ %>
		<td><form action="EditController" method="post">
						<input type="hidden" id="emp" name="empId"
							value="<%=student.getId()%>"> <input type="submit"
							value="edit">
					</form>
				<td><form action="Deletecontroller" method="post">
						<input type="hidden" id="emp" name="empId"
							value="<%=student.getId()%>"> <input type="submit"
							value="Delete">
					</form>
		<%}} %>
				
				
			<%} %>
			
			
			</tr>
			</tbody>
			</table>
			<%if(request.getSession().getAttribute("userName")==null&&request.getSession().getAttribute("password")==null){ %>
		<form action="LoginController" method ="get">
		<input type="submit" value="login">
		</form>
		<%}else  %>
		
			<%if(request.getSession().getAttribute("userName")!=null&&request.getSession().getAttribute("password")!=null){
			if(request.getSession().getAttribute("userName").equals("admin")&&request.getSession().getAttribute("password").equals("admin")){ %>
		<form action="LogoutController" method ="get">
		<input type="submit" value="logout">
		</form>
		<%}} %>
			


</body>
</html>


