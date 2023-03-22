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

@WebServlet("/SaveTeacher")
public class SaveTeacher extends HttpServlet{
	TeacherService teacherService=new TeacherService();
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Teacher teacher=new Teacher();
	teacher.setName(req.getParameter("name"));
	teacher.setSubject(req.getParameter("subject"));
	
	teacherService.testSave(teacher);
	RequestDispatcher requestDispatcher=req.getRequestDispatcher("successTeacher.html");
	requestDispatcher.forward(req, resp);
}
}
