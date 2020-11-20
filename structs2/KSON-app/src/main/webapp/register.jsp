<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="register">
<s:textfield name="username" label="Enter UserName"></s:textfield>
<s:textfield name="firstname" label="Enter First Name"></s:textfield>
<s:textfield name="lastname" label="Enter Last Name"></s:textfield>
<s:textfield name="middlename" label="Enter Middle Name"> </s:textfield>
<s:submit value="Register"></s:submit> 
</s:form>

<a style="color:red">
<s:property value="message"/>
</a>

</body>
</html>