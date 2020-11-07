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
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Gender</th>

</tr>
<h1>Welcome Guest User</h1>
<%
List <Student> students = (List<Student>) request.getAttribute("students");
for(Student student:students){%>
<tr>
<td><%=student.getId() %></td>
<td><%=student.getName() %></td>
<td><%=student.getGender() %></td>
</tr>
<%}
%>
</table>
<a href="Logout">Logout</a>
</body>
</html>