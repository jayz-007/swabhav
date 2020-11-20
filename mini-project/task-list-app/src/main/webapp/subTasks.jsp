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
	<h1>this is subtask page</h1>

	<s:form action="getSubTaskAddPage" method="get">
		<s:submit value="Add"></s:submit>
	</s:form>
	<table>
		<thead>
			<tr>
				<td>Done</td>
				<td>Id</td>
				<td>title</td>
				<td>Date</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="subtasks">
				<tr>
					<td><s:form action="checkSubTask">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:checkbox name="done" fieldValue="%{done}"
								onchange="this,form.submit()"></s:checkbox>
						</s:form></td>
					<td><s:property value="id" /></td>
					<td><s:property value="title" /></td>
					<td><s:property value="date" /></td>


					<td><s:form action="getSubTaskUpdatePage" method="get">
							<s:hidden value="%{id}" name="updateSubTask"></s:hidden>
							<s:submit value="update"></s:submit>
						</s:form></td>
					<td><s:form action="deleteSubTask">
							<s:hidden value="%{id}" name="deleteSubTask"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>

				</tr>

			</s:iterator>
		</tbody>

	</table>

</body>
</html>