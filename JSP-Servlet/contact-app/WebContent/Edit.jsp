<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Fill this form to Edit contact</h1>
<%String edit = (String)request.getAttribute("editcontact"); %>
<form action="EditContactController" method="post">
<label>FirstName</label>
<input type="text" name="fname"><br>
<label>Last tName</label>
<input type="text" name="lname"><br>
<label>Middle Name</label>
<input type="text" name="mname"><br>
<label>Phone</label>
<input type="text" name="phone"><br>
<label>Email</label>
<input type="text" name="email"><br>
<input type="hidden" name="editContactEmail" value="<%=edit %>">
<input type="submit" value="Edit Contact">
</form>

</body>
</html>