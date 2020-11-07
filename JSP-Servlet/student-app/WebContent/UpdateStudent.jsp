<%@page import="com.techlabs.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
  .mystyle{
  color: red;
  }
</style>
<body>
<%
Student student =(Student) request.getAttribute("student");

%>
<form method="POST" name="myForm" action="/student-app/EditController" onsubmit="return validateForm()">
		
		<input type="hidden"  name="edit" value="<%=student.getId() %>">
		<label>Name</label><br> 
		<input  type="text" name="name" value="<%=student.getName() %>"><br><br> 
		<div id="userName" class="mystyle">
		</div>
		
		
		<label>Gender</label><br>
		<input type="text" name="gender" value="<%=student.getGender() %>"><br><br>
		<div id="gender" class="mystyle">
		</div><br>
		
		<button type="submit">Submit Query</button>
	</form>


	<script>
		function validateForm() {
			console.log("Hello");
			temp = true;
			
			
			var userName = document.getElementById("userName");
			userName.removeChild(userName.childNodes[0]);
			var gender = document.getElementById("gender");
			gender.removeChild(gender.childNodes[0]);
			var textNode = document.createTextNode("Please enter some value");			
			var textNode1 = document.createTextNode("Please enter some value");
			if (document.forms["myForm"]["userName"].value == "") {
				console.log("empty");
				userName.appendChild(textNode1);
				temp = false;
			}
			
			
			if (document.forms["myForm"]["gender"].value == "") {
				gender.appendChild(textNode);
				console.log("empty");
				temp = false;
			}
			return temp;
		}
	</script>
</body>
</html>