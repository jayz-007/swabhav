<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is update</h1>
<s:form action="updateSuccess">
<s:textfield value="%{student.rollno}" label="Rollno" name="updatedRollno" type="number"></s:textfield>
<s:textfield value="%{student.name}" label="name" name="updatedName"></s:textfield>
<s:textfield value="%{student.gender}" label="gender" name="updatedGender"></s:textfield>
<s:textfield value="%{student.age}" label="Age" name="updatedAge" type="number"></s:textfield>
<s:textfield value="%{student.cgpa}" label="CGPA" name="updatedCgpa"></s:textfield>
<s:hidden name="updateStudent" value ="%{student.id}"></s:hidden>
<s:submit value="Edit"></s:submit>
</s:form>
<a style="color:red">
<s:property  value="message"/>
</a>
</body>
</html>