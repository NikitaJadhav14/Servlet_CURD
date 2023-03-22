package com.jsp.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.StudentService;
@WebServlet("/student input")
public class HelperGetAll extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService studentService=new StudentService();
		studentService.getAllStudents();
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAll.jsp");
		requestDispatcher.forward(req, resp);

	}

}
