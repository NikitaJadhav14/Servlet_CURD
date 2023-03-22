package com.jsp.teacher.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;
@WebServlet("/Updatestudent")
public class updateTeacher extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	TeacherService teacherService=new TeacherService();
	Teacher teacher=new Teacher();
	String id =req.getParameter("id");
	int i=Integer.parseInt(id);
	
	teacher.setId(i);
	teacher.setName(req.getParameter("name"));
	teacher.setSubject(req.getParameter("Subject"));
	
	teacherService.UpdateById(teacher);
	
	RequestDispatcher  requestDispatcher=req.getRequestDispatcher("update.html");
	requestDispatcher.forward(req, resp);
}
}
