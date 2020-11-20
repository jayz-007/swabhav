<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<s:head />
</head>
<body>
<s:form action="update">
		<div class="form-group">
		<s:hidden name="id" value="%{editId}"></s:hidden>
		</div>
		<div class="form-group">
		<s:textfield name="name" label="Enter name"></s:textfield>
		</div>
		<div class="form-group">
		<s:textfield name="gender" label="Enter gender"></s:textfield>
		</div>
		<s:submit class="btn btn-primary" value="Edit Info"></s:submit>
	</s:form>
</body>
</html>