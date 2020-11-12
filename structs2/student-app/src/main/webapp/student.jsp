<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import=" org.apache.struts2.ServletActionContext"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
tr:hover {
	background-color: #ffd500;
}
</style>

</head>
<body style="background-color: #e6ffec">
	<div class="w3-sidebar w3-bar-block w3-border-right"
		style="display: none; width: 9%" id="mySidebar">
		<button onclick="w3_close()" class="w3-bar-item w3-large">Close
			&times;</button>
		<s:form action="getAddPage" style="size:relative">
			<s:submit value="Add Student" class="btn btn-outline-warning"></s:submit>
		</s:form>

	</div>


	<nav class="navbar navbar-dark bg-primary">

		<%
			HttpSession curretnsession = ServletActionContext.getRequest().getSession();
		%>
		<%
			if (curretnsession.getAttribute("loggedIn") != null
					&& curretnsession.getAttribute("loggedIn").equals(true)) {
		%>

		<div>
			<span  class="btn btn-outline-dark" onclick="w3_open()">Sidebar</span>
			<h1 class="navbar-brand">Student Info</h1>
		</div>


		<s:form action="Logout" class="form-inline my-2 my-lg-0">
			<a class="navbar-brand">Welcome Admin</a>
			<s:submit class="btn btn-secondary" value="Logout"></s:submit>
		</s:form>
		<%
			} else {
		%>
		<h1 class="navbar-brand">Student Info</h1>
		<s:form action="getLoginPage" class="form-inline my-2 my-lg-0">
			<h1 class="navbar-brand">welcome guest</h1>
			<s:submit class="btn btn-secondary" value="Login"></s:submit>
		</s:form>

		<%
			}
		%>

	</nav>
	<table class="table">
		<thead class="thead-dark">
			<tr>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Roll no</th>
				<th>Name</th>
				<th scope="col">Gender</th>
				<th scope="col">age</th>
				<th scope="col">CGPA</th>
				<%
					if (curretnsession.getAttribute("loggedIn") != null
							&& curretnsession.getAttribute("loggedIn").equals(true)) {
				%>
				<th scope="col">Update</th>
				<th scope="col">Delete</th>
				<%
					}
				%>
			</tr>
		</thead>
		<s:iterator value="students">
			<tbody style="background-color: #e6ffec">
				<tr>

					<td><s:property value="id" /></td>
					<td><s:property value="rollno" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="gender" /></td>
					<td><s:property value="age" /></td>
					<td><s:property value="cgpa" /></td>
					<%
						if (curretnsession.getAttribute("loggedIn") != null
									&& curretnsession.getAttribute("loggedIn").equals(true)) {
					%>
					<td><s:form action="updateStudentPage">
							<s:hidden name="updateStudent" value="%{id}"></s:hidden>
							<s:submit value="Update" class="btn btn-outline-primary"></s:submit>
						</s:form></td>

					<td><s:form action="deleteStudent" method="post">
							<s:hidden name="deleteStudent" value="%{id}"></s:hidden>
							<s:submit value="Delete" class="btn btn-outline-danger"></s:submit>
						</s:form></td>
					<%
						}
					%>
				</tr>
			</tbody>
		</s:iterator>

	</table>





</body>
<script>
	function w3_open() {
		document.getElementById("mySidebar").style.display = "block";
	}

	function w3_close() {
		document.getElementById("mySidebar").style.display = "none";
	}
</script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>
</html>