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
<s:form action="updateTask">
<s:textfield value="%{task.title} " name="title" label="Enter Title"></s:textfield>
<s:hidden value="%{updateTask}" name="updateTask" ></s:hidden>
<s:submit value="Update"></s:submit>
</s:form>
<a style="color:red">
<s:property value="validationMessage"/>
</a>

</body>
</html>