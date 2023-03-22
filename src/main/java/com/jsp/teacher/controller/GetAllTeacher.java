package com.jsp.teacher.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.TeacherService;
@WebServlet("/teacher input")
public class GetAllTeacher extends HttpServlet {
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	TeacherService teacherService=new TeacherService();
	teacherService.getAllTeachers();
	
	RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllTeacher.jsp");
	requestDispatcher.forward(req, resp);
}
}
