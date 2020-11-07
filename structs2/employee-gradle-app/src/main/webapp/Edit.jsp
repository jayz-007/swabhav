<%@page import="com.techlabs.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="EditEmployeeController" method="post" >
<%Employee emp = (Employee)request.getAttribute("editEmployee");
request.setAttribute("editEmployee", emp);
%>
		<label>Name</label>
		<input type="text" name="Name" id="name" value="<%=emp.getName() %>"><br> 
		<label>Role</label>
		<input type="text" name="Role" id="role" value="<%=emp.getRole() %>"><br> 
		<input type="hidden" name="id" value="<%=emp.getId() %>">
		<input type="submit"value="Add Employee" >

	</form>

</body>
</html>