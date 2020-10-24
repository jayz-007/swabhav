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
		int oldCount;
		int newCount;
		if (session.getAttribute("counter") == null) {
			oldCount = 0;
			newCount = 1;
		} else {
			oldCount = (int) session.getAttribute("counter");

		}
	
		newCount = oldCount + 1;
		out.print("Old " + oldCount + "<br>");
		out.print("New " +  newCount + "<br>");
		out.print("Id " + session.getId());
		session.setAttribute("counter", newCount);
	%>

	<div>
		<br> <a href="summary1.jsp">Summary</a>
	</div>
</body>
</html>