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
		int count;
	if(application.getAttribute("counter")==null){
		count =0;
	}
	else{
		count =(int) application.getAttribute("counter");
		
	}
	int oldCount = count;
	count++;

	out.print("Old " + oldCount + "<br>");
	out.print("New " + count + "<br>");
	out.print("Id " + session.getId());
	application.setAttribute("counter", count);
	%>
	
	<div>
	<br>
	<a href="summary.jsp">Summary</a>
	</div>
</body>
</html>