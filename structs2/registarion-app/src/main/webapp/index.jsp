<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sendemail" method="post" autocomplete="off">
		<label for="from">From</label><br> <input type="text" name="from" /><br>
		<label for="password">Password</label><br> <input type="password"
			name="password" /><br> <label for="to">To</label><br> <input
			type="text" name="to" /><br> <label for="subject">Subject</label><br>
		<input type="text" name="subject" /><br> <label for="body">Body</label><br>
		<input type="text" name="body" /><br> <input type="submit"
			value="Send Mail" />
	</form>
</body>
</html>