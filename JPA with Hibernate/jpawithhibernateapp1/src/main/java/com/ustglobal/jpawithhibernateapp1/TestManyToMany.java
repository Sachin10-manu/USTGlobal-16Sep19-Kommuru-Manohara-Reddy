package com.ustglobal.jpawithhibernateapp1;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernateapp1.manytomany.Course;
import com.ustglobal.jspwithhibernateapp1.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {	
		
		Course c = new Course();
		c.setCid(11);
		c.setCname("Java");
		
		Course c1 = new Course();
		c1.setCid(21);
		c1.setCname("sql");
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c);
		al.add(c1);
		
		Student s = new Student();
		s.setSid(10);
		s.setSname("Manu");
		s.setCourse(al);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s);

			System.out.println("Record saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}