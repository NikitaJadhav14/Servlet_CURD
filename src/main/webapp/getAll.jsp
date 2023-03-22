<%@page import="com.jsp.dto.Student"%>
<%@page import="com.jsp.service.StudentService"%>
<%@page import="com.jsp.student.controller.HelperGetAll"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%StudentService studentService=new StudentService();%>
<table border="1" style="border-collapse: collapse;">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Std </th>
</tr>

<%for(Student s:studentService.getAllStudents()){ %>
	<tr>
	<td><%= s.getId()%></td>
	<td><%= s.getName()%></td>
	<td><%= s.getEmail()%></td>
	<td><%= s.getStd()%></td>
	</tr>


<%} %>

</table>

</body>
</html>