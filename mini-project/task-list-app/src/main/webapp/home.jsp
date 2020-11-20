<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="getLoginPage">
<s:submit value="Login"></s:submit>
</s:form>

<s:form action="getRegisterPage">
<s:submit value="Register"></s:submit>
</s:form>


</body>
</html>