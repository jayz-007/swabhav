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
<h1>Fill details to add user</h1> 
<s:form action="addUser">
<s:textfield name="firstname" label="Enter first name"></s:textfield>
<s:textfield name="lastname" label="Enter last name"></s:textfield>
<s:textfield name="email" label="Enter email"></s:textfield>
<s:textfield name="username" label="Enter username"></s:textfield>
<s:password name="password" label="Enter password"></s:password>
<s:submit value="Add"></s:submit>
</s:form>
<a style="color:red">
<s:property value="validationMessage"/>
</a>

</body>
</html>