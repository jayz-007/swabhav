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

	<s:form action="getTaskAddPage" method="get">
		<s:hidden value="%{userId}" name="userId"></s:hidden>
		<s:submit value="Add"></s:submit>
	</s:form>
	<table>
		<thead>
			<tr>
				<td>Done</td>
				<td>Id</td>
				<td>title</td>
				<td>Date</td>
				<td>Tasks</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="tasks">
				<tr>
					<td><s:form action="checkTask">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:checkbox name="done" fieldValue="%{done}"
								onchange="this,form.submit()"></s:checkbox>
						</s:form></td>
					<td><s:property value="id" /></td>
					<td><s:property value="title" /></td>
					<td><s:property value="date" /></td>

					<td><s:form action="SubtasksDisplay" method="get">
							<s:hidden value="%{id}" name="currentTaskId"></s:hidden>
							<s:submit value="Tasks"></s:submit>
						</s:form></td>
					<td><s:form action="getTaskUpdatePage" method="get">
							<s:hidden value="%{id}" name="updateTask"></s:hidden>
							<s:submit value="update"></s:submit>
						</s:form></td>
					<td><s:form action="deleteTask">
							<s:hidden value="%{id}" name="deleteTask"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>

				</tr>

			</s:iterator>
		</tbody>

	</table>

</body>
</html>