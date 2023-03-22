package com.jsp.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService studentService = new StudentService();
		Student student=new Student();
		String id =req.getParameter("id");
		int i = Integer.parseInt(id);
		student.setId(i);
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setStd(req.getParameter("std"));

	
		
		studentService.UpdateById(student);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("update.html");
		requestDispatcher.forward(req, resp);
		
	}

}
