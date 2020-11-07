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
<s:form action="submitUser">
<s:textfield key="developer"></s:textfield>
<s:submit ></s:submit>
</s:form>

<h1>
<s:property value="developer"/>
</h1>

</body>
</html>