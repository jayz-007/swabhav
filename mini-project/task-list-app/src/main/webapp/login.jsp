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

<s:form action="LoginAuthentication">

		<s:textfield name="username" placeholder="Enter Username">
		</s:textfield>
		<s:password placeholder="Enter Password" name="password">
		</s:password>
		<s:submit value="login" ></s:submit>
		
	</s:form>
	<a style="color: red"> <s:property value="message" />
		</a>

</body>
</html>