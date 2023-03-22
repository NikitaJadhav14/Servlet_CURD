<%@page import="com.jsp.dto.Teacher"%>
<%@page import="com.jsp.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%TeacherService teacherService=new TeacherService();%>
<table border="1" style="border-collapse: collapse;">
<tr>
<th>Id</th>
<th>Name</th>
<th>Subject</th>

</tr>

<%for(Teacher t:teacherService.getAllTeachers()){ %>
	<tr>
	<td><%= t.getId()%></td>
	<td><%= t.getName()%></td>
	<td><%= t.getSubject()%></td>

	</tr>


<%} %>

</table>
</body>
</html>