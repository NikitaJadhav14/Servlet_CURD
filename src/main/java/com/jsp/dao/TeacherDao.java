package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void testSave(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
	}

	public void UpdateById(Teacher teacher) {
		Teacher t1 = entityManager.find(Teacher.class, teacher.getId());
		if (t1 != null) {
			t1.setId(teacher.getId());
			t1.setName(teacher.getName());
			t1.setSubject(teacher.getSubject());
			entityTransaction.begin();
			entityManager.merge(t1);
			entityTransaction.commit();
		}
	}

	public void deleteById(int id) {
		Teacher t1 = entityManager.find(Teacher.class, id);
		if (t1 != null) {
			entityTransaction.begin();
			entityManager.remove(t1);
			entityTransaction.commit();
		}
	}
	public List<Teacher> getAllTeachers() {
		String sql="select s from Teacher s";
	Query q=	entityManager.createQuery(sql);
	return q.getResultList();
	}
	
	
	public Teacher getById(int id) {
		return entityManager.find(Teacher.class,id);
	}
	

}
