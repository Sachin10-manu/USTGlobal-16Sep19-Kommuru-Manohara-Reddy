package com.ustglobal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Student;

public class Update {
	public static void main(String[] args) {
		
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			
			Student s = em.find(Student.class, 1);
			s.setSname("Manohar");
			System.out.println("Record Updated");
			et.commit();
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
}
