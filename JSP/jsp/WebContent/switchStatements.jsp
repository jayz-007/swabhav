<%@page import="com.sun.java_cup.internal.runtime.Scanner"%>
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
		int choice = 1;
		switch (choice) {
		case 1:
			out.print("case 1 ");
			break;
		case 2:
			out.print("case 2");
			break;
		default: out.print("default");
			break;
		}
		
	%>

</body>
</html>