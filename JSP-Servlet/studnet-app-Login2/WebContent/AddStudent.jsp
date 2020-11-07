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
		if (request.getSession().getAttribute("userName") != null
				&& request.getSession().getAttribute("password") != null) {
			if (request.getSession().getAttribute("userName").equals("admin")
					&& request.getSession().getAttribute("password").equals("admin")) {
	%>
	<h1>fill this form to add Employee</h1>
	<form action="AddStudentController" method="post">

		<label>Name</label> <input type="text" name="Name" id="name"><br>
		<label>Role</label> <input type="text" name="Role" id="role"><br>
		<input type="submit" value="Add">

	</form>
	<%
		}
		}else{
	%>
	
	
	<%} %>

</body>
</html>