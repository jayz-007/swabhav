<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sendemail" method="post" autocomplete="off">
	<label for="name">Name</label><br>
	<input type="text" name="name"><br>
	<label for="gender">Gender</label><br>
	<input type="text" name="gender"><br>
	<label for="address">Address</label><br>
	<input type="text" name="address"><br>
	<label for="age">Age</label><br>
	<input type="text" name="age"><br>
	<label for="captchaCode">CaptchaCode</label>
	 <label for="to">To</label><br> 
	 <input type="text" name="to" /><br>
	 <label for="captchaCode">Captcha Code</label>
	 <botDetect:captcha id="exampleCaptcha" userInputID="captchaCode"></botDetect:captcha>
	 <s:textfield name="captchaCode"></s:textfield>
	 
	  <input type="submit"value="Send Mail" />
	</form>
</body>
</html>