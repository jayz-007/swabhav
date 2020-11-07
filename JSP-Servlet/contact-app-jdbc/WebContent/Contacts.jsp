<%@page import="com.techlabs.model.Contact"%>
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
		List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
	%>

	<h1>Welcome Admin</h1>
	<a href="AddController">Add</a>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Phone</th>
			<th>Email id</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
			for (Contact contact : contacts) {
		%>
		<tr>
			<td><%=contact.getId()%></td>
			<td><%=contact.getFirstName()%></td>
			<td><%=contact.getMiddleName()%></td>
			<td><%=contact.getLastName()%></td>
			<td><%=contact.getPhone()%></td>
			<td><%=contact.getEmailId()%></td>
			<td><form method="GET" action="EditController">
					<input type="hidden" name="edit" value="<%=contact.getId()%>">
					<input type="submit" value="edit">
				</form></td>
			<td><form method="GET" action="DeleteController"
					onsubmit="return confirm('Do you really want delete?');">
					<input type="hidden" name="delete" value="<%=contact.getId()%>">
					<input type="submit" value="delete">

				</form></td>
		</tr>

		<%
			}
		%>
	
</body>
</html>