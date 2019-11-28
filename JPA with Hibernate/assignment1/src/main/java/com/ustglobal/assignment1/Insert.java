package com.ustglobal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Student;

public class Insert {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("Manu");
		s.setMarks(95);
		
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(s);
			System.out.println("Record inserted");
			et.commit();
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
}
