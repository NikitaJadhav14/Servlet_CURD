package com.jsp.teacher.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.TeacherService;
@WebServlet("/delete2")
public class DeleteTeacher extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	TeacherService teacherService=new TeacherService();
	String id =req.getParameter("id");
	int  i=Integer.parseInt(id);
	
	teacherService.deleteById(i);
	
	RequestDispatcher requestDispatcher=req.getRequestDispatcher("delete.html");
	requestDispatcher.forward(req, resp);
	
}
}
