package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
	TeacherDao dao=new  TeacherDao();
	public void testSave(Teacher teacher) {
		dao.testSave(teacher);
	}
	public void UpdateById(Teacher teacher ) {
		dao.UpdateById(teacher);
	}
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	public List<Teacher> getAllTeachers() {
		return	dao.getAllTeachers();
		}
		public Teacher getById(int id) {
			return dao.getById(id);
		}
}
