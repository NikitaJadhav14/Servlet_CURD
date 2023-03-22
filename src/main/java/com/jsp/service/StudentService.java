package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao dao=new StudentDao();

	public void testSave(Student student) {
		dao.testSave(student);
}
	public void UpdateById(Student student) {
		dao.UpdateById(student);
	}
	public void DeleteById(int id) {
		dao.DeleteById(id);
	}
	public List<Student> getAllStudents() {
	return	dao.getAllStudents();
	}
	public Student getById(int id) {
		return dao.getById(id);
	}
}