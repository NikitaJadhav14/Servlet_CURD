package com.jsp.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.StudentService;
@WebServlet("/delete1")
public class DeleteStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService studentService = new StudentService();
		String id =req.getParameter("id");
		int i = Integer.parseInt(id);
		
		studentService.DeleteById(i);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("delete.html");
        requestDispatcher.forward(req, resp);
	}

}
