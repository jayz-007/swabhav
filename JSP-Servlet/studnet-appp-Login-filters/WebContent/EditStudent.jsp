<%@page import="com.techlabs.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Student studnet = (Student)request.getAttribute("edit"); %>>
	<h1>fill this form to Edot Student</h1>
	<form action="EditController" method="post">

		<label>Name</label> <input type="text" name="Name" id="name" >"><br>
		<label>Gender</label> <input type="text" name="Role" id="role" >"><br>
		<input type="hidden" value="<%=studnet.getId() %>>" name="edit">
		<input type="submit" value="Edit">

	</form>
	

</body>
</html>