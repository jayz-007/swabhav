<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form  action="loginDo" method="post">
		<div class="form-group">		
		<label for="name">Please enter your name</label><br> 
		<input type="text" name="name" /> <br>
		</div>
		<div class="form-group">
		<label for="password">Password:-</label><br> 
		<input type="password" name="password" /><br>
		</div>
		<input class="btn btn-primary" type="submit" value="Submit" />
		
	</form>
	<p style = "color:red" ><s:property value="message"/></p>
</body>
</html>