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
<s:form action="addSubTask">
<s:textfield name="title" label="Enter Title"></s:textfield>
<s:submit value="Add"></s:submit>
</s:form>
<a style="color:red">
<s:property value="validationMessage"/>
</a>

</body>
</html>