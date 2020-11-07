<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.techlabs.model.Contact"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Phone Book</title>
</head>
<body>
	<h1>Contact Details</h1>
	<form action="LogoutController" method="get" >
		<button>Logout</button>
	</form>
	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.html");
		}
		List<Contact> contacts = (List<Contact>) request.getAttribute("contact");
	%>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>FName</th>
				<th>LName</th>
				<th>Phone</th>
				<th>Email</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (Contact contact : contacts) {
			%>
			<tr>
				<td><%=contact.getFname()%></td>
				<td><%=contact.getLname()%></td>
				<td><%=contact.getPhone()%></td>
				<td><%=contact.getEmail()%></td>

				<td><form action="EditController" method="GET">
						<input type="hidden" name="fname" value="<%=contact.getFname()%>">
						<input type="submit" value="Edit">
					</form>
				<td><form action="DeleteController" method="POST">
						<input type="hidden" name="fname" value="<%=contact.getFname()%>">
						<input type="submit" value="Delete">
					</form>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<form action="AddController" method="POST">
		<input type="submit" value="Add">
	</form>
</body>
</html>