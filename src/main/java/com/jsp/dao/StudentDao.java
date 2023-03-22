package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void testSave(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public void UpdateById(Student student) {
		Student s1 = entityManager.find(Student.class, student.getId());
		if (s1 != null) {
			s1.setId(student.getId());
			s1.setName(student.getName());
			s1.setEmail(student.getEmail());
			s1.setStd(student.getStd());
			entityTransaction.begin();
			entityManager.merge(s1);
			entityTransaction.commit();
		}
	}

	public void DeleteById(int id) {
		Student s1 = entityManager.find(Student.class, id);
		if (s1 != null) {
			entityTransaction.begin();
			entityManager.remove(s1);
			entityTransaction.commit();
		}
	}

	public List<Student> getAllStudents() {
		String sql="select s from Student s";
	Query q=	entityManager.createQuery(sql);
	return q.getResultList();
	}
	
	
	public Student getById(int id) {
		return entityManager.find(Student.class,id);
	}
	
	
}
