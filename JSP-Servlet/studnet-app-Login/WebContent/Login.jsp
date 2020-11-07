<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="AuthController" onsubmit="return validateForm()">

		<label>UserName</label><br> 
		<input  type="text" name="userName" ><br><br> 
		<div id="userName" class="mystyle">
		</div>
		
		
		<label>Password</label><br>
		<input type="password" name="password" ><br><br>
		<div id="password" class="mystyle">
		</div><br>
		
		<button type="submit">Submit Query</button>
	</form>


	<script>
		function validateForm() {
			temp = true;
			
			
			var userName = document.getElementById("userName");
			userName.removeChild(userName.childNodes[0]);
			var password = document.getElementById("password");
			password.removeChild(password.childNodes[0]);
			var textNode = document.createTextNode("Please enter some value");			
			var textNode1 = document.createTextNode("Please enter some value");
			if (document.forms["myForm"]["userName"].value == "") {
				console.log("empty");
				userName.appendChild(textNode1);
				temp = false;
			}
			
			
			if (document.forms["myForm"]["password"].value == "") {
				password.appendChild(textNode);
				console.log("empty");
				temp = false;
			}
			return temp;
		}
	</script>
</body>
</html>