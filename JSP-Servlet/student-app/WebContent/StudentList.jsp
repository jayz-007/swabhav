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
<a href="/student-app/AddStudent">Add</a>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Gender</th>
<%if(session.getAttribute("userName")!=null){ %>
<th>Edit</th>
<th>Delete</th>
<% }%>
</tr>
<h1>Welcome Admin</h1>
<%
List <Student> students = (List<Student>) request.getAttribute("students");
for(Student student:students){%>
<tr>
<td><%=student.getId() %></td>
<td><%=student.getName() %></td>
<td><%=student.getGender() %></td>
<%if(session.getAttribute("userName")!=null){ %>
<td><form method="GET" action="/student-app/EditController">
<input  type="hidden"  name="edit" value="<%=student.getId() %>">
<input type="submit" value="edit">
</form></td>
<td><form method="GET" action="/student-app/deleteController" onsubmit="return confirm('Do you really want delete?');">
<input  type="hidden"  name="delete" value="<%=student.getId() %>">
<input type="submit" value="delete">
<% }%>
</form></td>
</tr>
<%}
%>
</table>
<%if(session.getAttribute("userName")!=null){ %>
<a href="Logout">Logout</a>
<%} %>
</body>
</html>