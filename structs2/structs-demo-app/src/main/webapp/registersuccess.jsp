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
<h1>Welcome :
<s:property value="username"/>
</h1>
<h1>First name :
<s:property value="firstname"/>
</h1>
<h1>
Second name:
<s:property value="middlename"/>
</h1>
<h1>
Last name :
<s:property value="lastname"/>
</h1>


</body>
</html>