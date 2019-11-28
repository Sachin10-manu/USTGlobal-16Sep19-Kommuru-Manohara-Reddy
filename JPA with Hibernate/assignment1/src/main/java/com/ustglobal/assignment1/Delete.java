package com.ustglobal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Student;

public class Delete {
	public static void main(String[] args) {
		
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			Student s = em.find(Student.class, 1);
			em.remove(s);
			System.out.println("Data removed");
			et.commit();
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
}
