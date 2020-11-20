<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>
	<h1>This is register page</h1>
	<s:form action="register">
		<s:textfield name="firstname" id="firstname" label="Enter first name"></s:textfield>
		<s:textfield name="lastname" id="lastname" label="Enter last name"></s:textfield>
		<s:textfield name="email" id="email" label="Enter email"></s:textfield>
		<s:textfield name="username" id="username" label="Enter username"></s:textfield>
		<s:password name="password" id="password" label="Enter password"></s:password>
		<s:password name="confirmPassword" id="confirmPassword" label="Confirm Password"></s:password>
		<s:submit value="Register"></s:submit>
	</s:form>
	<a style="color: red"> <s:property value="validationMessage" />
	</a>
	
	<script type="text/javascript">
	$(document).ready(function (){
	    validate();
	    $('#firstname, #lastname, #password ,email,username,confirmPassword').change(validate);
	});

	function validate(){
	    if ($('#firstname').val().length >0   &&
	        $('#lastname').val().length >0   &&
	        $('#password').val().length >0 &&
	        $('#email').val().length >0  &&
	        $('#username').val().length >0 &&
	        $('#confirmPassword').val().length> 0   
	        
	    ) {
	        $("input[type=submit]").prop("disabled", false);
	    }
	    else {
	        $("input[type=submit]").prop("disabled", true);
	    }
	}
	
	</script>

</body>
</html>