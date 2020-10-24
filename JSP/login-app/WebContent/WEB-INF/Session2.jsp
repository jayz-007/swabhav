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
	if(session.getAttribute("counter")==null){
		count =0;
	}
	else{
		count =(int) session.getAttribute("counter");
		
	}
	int oldCount = count;
	count++;

	out.print("Old " + oldCount + "<br>");
	out.print("New " + count + "<br>");
	out.print("Id " + session.getId());
	session.setAttribute("counter", count);
	%>
</body>
</html>