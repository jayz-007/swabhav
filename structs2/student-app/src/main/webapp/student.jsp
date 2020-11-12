<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import=" org.apache.struts2.ServletActionContext"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, tr, td {
	border: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
	<%
		HttpSession curretnsession = ServletActionContext.getRequest().getSession();
	%>
	<%
		if (curretnsession.getAttribute("loggedIn") != null
				&& curretnsession.getAttribute("loggedIn").equals(true)) {
	%>
	<h1>Welcome admin</h1>
	<h1>Student Info</h1>
	<br>
	<s:form action="getAddPage">
		<s:submit value="Add Student"></s:submit>
	</s:form>

	<s:form action="Logout">
		<s:submit value="Logout"></s:submit>
	</s:form>
	<%
		} else {
	%>
	<h1>welcome guest</h1>
	<%
		}
	%>
	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Roll no</td>
				<td>Name</td>
				<td>Gender</td>
				<td>age</td>
				<td>CGPA</td>
				<%
					if (curretnsession.getAttribute("loggedIn") != null
							&& curretnsession.getAttribute("loggedIn").equals(true)) {
				%>
				<td>Update</td>
				<td>Delete</td>
				<%
					}
				%>
			</tr>
		</thead>
		<s:iterator value="students">
			<tbody>
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
							<s:submit value="Update"></s:submit>
						</s:form></td>

					<td><s:form action="deleteStudent" method="post">
							<s:hidden name="deleteStudent" value="%{id}"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>
					<%
						}
					%>
				</tr>
			</tbody>
		</s:iterator>

	</table>
	<%
		if (curretnsession.getAttribute("loggedIn")==(null)) {
	%>

	<s:form action="getLoginPage">
	<s:submit value="Login"></s:submit>
	</s:form>

	<%
		}
	%>
</body>
</html>