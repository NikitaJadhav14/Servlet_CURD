package com.jsp.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/GetStudent")
public class GetStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("id"));
		StudentService studentService =new StudentService();
		Student student=studentService.getById(id);

		 
	      PrintWriter printWriter=resp.getWriter();
	      printWriter.write("id :"+student.getId());
	      printWriter.write("\n  name :"+student.getName());
	      printWriter.write("\n email :"+student.getEmail());
	      printWriter.write("\n std : "+student.getStd());
	      
		
	}

}
