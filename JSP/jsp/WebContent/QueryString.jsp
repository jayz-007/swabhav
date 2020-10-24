<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
String name = request.getParameter("name");
for(int i=0;i<5;i++){
	out.print("Hello "+name+"</br>");
}
%>

</body>
</html>