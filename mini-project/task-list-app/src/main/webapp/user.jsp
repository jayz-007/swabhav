<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<s:form action="Logout">
		<s:submit value="Logout"></s:submit>
	</s:form>

	<s:form action="getUserAddPage" method="get">
		<s:submit value="Add"></s:submit>
	</s:form>
	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>FirstName</td>
				<td>Lastname</td>
				<td>Email</td>
				<td>UserName</td>
				<td>Password</td>
				<td>Tasks</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="users">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="firstname" /></td>
					<td><s:property value="lastname" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="username" /></td>
					<td><s:property value="password" /></td>
					<td><s:form action="tasksDisplay" method="get">
							<s:hidden value="%{id}" name="userId"></s:hidden>
							<s:submit value="Tasks"></s:submit>
						</s:form></td>
					<td><s:form action="getUserUpdatePage" method="get">
							<s:hidden value="%{id}" name="updateUser"></s:hidden>
							<s:submit value="update"></s:submit>
						</s:form></td>
					<td><s:form action="deleteUser">
							<s:hidden value="%{id}" name="deleteUser"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>

				</tr>

			</s:iterator>
		</tbody>

	</table>

</body>
</html>