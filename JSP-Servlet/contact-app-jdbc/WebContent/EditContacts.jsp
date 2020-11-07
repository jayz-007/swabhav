<%@page import="com.techlabs.model.Contact"%>
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
Contact contact =(Contact) request.getAttribute("contact");

%>
<form method="POST" name="myForm" action="EditController">
		<input type="hidden"  name="id" value="<%=contact.getId() %>">
		
		<label>First Name</label><br> 
		<input  type="text" name="firstName" value="<%=contact.getFirstName() %>"><br><br> 
		<div id="firstName" class="mystyle">
		</div>
		
		
		<label>Middle Name</label><br>
		<input type="text" name="middleName" value="<%=contact.getMiddleName() %>"><br><br>
		<div id="middleName" class="mystyle">
		</div>
	
		<label>Last Name</label><br>
		<input type="text" name="lastName" value="<%=contact.getLastName() %>"><br><br>
		<div id="lastName" class="mystyle">
		</div>
		
			<label>Phone</label><br>
		<input type="text" name="phone" value="<%=contact.getPhone() %>"><br><br>
		<div id="phone" class="mystyle">
		</div>
		
			<label>email</label><br>
		<input type="text" name="email" value="<%=contact.getEmailId() %>"><br><br>
		<div id="email" class="mystyle">
		</div>	
		
		
		<br>
		
		<button type="submit">Submit Query</button>
	</form>

</body>
</html>