package com.jsp.teacher.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/GetTeacher")
public class GetByIdTeacher extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		TeacherService teacherService = new TeacherService();
		Teacher teacher = teacherService.getById(id);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("id :" + teacher.getId());
		printWriter.write("\n Name :" + teacher.getName());
		printWriter.write("\n Subject :" + teacher.getSubject());
	}
}
