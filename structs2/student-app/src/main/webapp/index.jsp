<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<s:form action="LoginAuthentication">
<s:textfield key="username"  name="username"> </s:textfield>
<s:password  key="password" name="password"> </s:password>
<s:submit value="login"></s:submit>
</s:form>
<a style="color:red">
<s:property value="message"/>
</a>
</html>