<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.techlabs.model.Contact"%>
<%@page import="com.techlabs.service.ContactService"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Contacts</h1>

	<form action="AddContact.jsp" method="get">
		<input type="submit" value="Add Contact">
	</form>
	<%
		List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
	%>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>MiddleName</th>
				<th>PhoneNo</th>
				<th>EmailId</th>
				<th>Add</th>
				<th>Edit</th>.
			</tr>
		</thead>
		<tbody>
			<%
				for (Contact contact : contacts) {
			%>
			<tr>
				<td><%=contact.getFname()%></td>
				<td><%=contact.getLname()%></td>
				<td><%=contact.getMname()%></td>
				<td><%=contact.getPhone()%></td>
				<td><%=contact.getEmailId()%></td>
				<td>
					<form action="DeleteController" method="post">
						<input type="hidden" name="DeleteContactEmail" value="<%=contact.getEmailId() %>">
						<input type="submit" value="Delete">
					</form>
				</td>
				<td>
					<form action="EditPageController" method="post">
					<input type="hidden" name="editContactEmail" value="<%=contact.getEmailId()%>">
						<input type="submit" value="Edit">
					</form>
				</td>
			</tr>


			<%
				}
			%>
		</tbody>
	</table>
	<tbody>
</body>
</html>