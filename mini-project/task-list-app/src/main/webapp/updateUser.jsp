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
<s:form action="updateUser">
<s:textfield value="%{user.firstname}" name="firstname" label="Enter first name"></s:textfield>
<s:textfield value="%{user.lastname}" name="lastname" label="Enter last name"></s:textfield>
<s:textfield value="%{user.email}" name="email" label="Enter email"></s:textfield>
<s:textfield value="%{user.username}" name="username" label="Enter username"></s:textfield>
<s:textfield value="%{user.password}" name="password" label="Enter password"></s:textfield>
<s:hidden value="%{updateUser}" name="updateUser"></s:hidden>
<s:submit value="update"></s:submit>
</s:form>
<a style="color:red">
<s:property value="validationMessage"/>
</a>

</body>
</html>