<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Cookie [] cookies = request.getCookies();
for(int i=0;i<cookies.length;i++){
	if(cookies[i].getName().equals("cookie-app")){
		out.print("<h2>Cookie found</h2> <style=\"background-color:powderblue\"");
	}
}
%>

</body>
</html>