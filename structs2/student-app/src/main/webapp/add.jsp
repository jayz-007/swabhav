<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fill details to add Student</h1>

<s:form action="addStudent">
<s:textfield name="name" label="Enter name"></s:textfield>
<s:textfield name="gender" label="Enter Gender"></s:textfield>
<s:submit value="Add Student"></s:submit>
</s:form>

<a style="color:red">
<s:property value="message"/>
</a>
</body>
</html>