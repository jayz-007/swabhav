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
	<label for="name">Enter Name : </label>
	<input type="text" name="name"><br>
	<label for="gender">Enter Email : </label>
	<input type="text" name="gender"><br>
	<label for="address">Enter Username : </label>
	<input type="text" name="address"><br>
	<label for="age">Enter Password : </label>
	<input type="text" name="age"><br>
	<label for="to">Confirm Password</label>
	 <input type="text" name="to" /><br>
	<label>Cpatcha code</label>
	 <botDetect:captcha id="exampleCaptcha" userInputID="captchaCode"></botDetect:captcha><br>
	  <label for="captchaCode">Enter Captcha Code</label>
	 <s:textfield name="captchaCode"></s:textfield><br>
	 
	  <input type="submit"value="Register" />
	</form>
</body>
</html>