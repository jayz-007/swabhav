<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
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
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link active" href="add">Add</a>
    </li>
   
  </ul>
   <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link active" href="logout">Logout</a>
            </li>
        </ul>
    </div>
</nav>
	
	<h1 class="offset-4">Student Information</h1>
	<div class="jumbotron">
	<table class="table">
		<thead class="thead-dark" >
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Gender</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="students" status="studentsStatus">
				<tr>
					<td scope="row"><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="gender" /></td>
					<td><s:form action="updateForm">
							<s:hidden name="editId" value="%{id}"></s:hidden>
							<s:submit class="btn btn-outline-primary" value="edit"></s:submit>
						</s:form></td>
					<td><s:form action="delete">
							<s:hidden name="deleteId" value="%{id}"></s:hidden>
							<s:submit class="btn btn-outline-danger" value="delete"></s:submit>
						</s:form></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	</div>
	

</body>
</html>