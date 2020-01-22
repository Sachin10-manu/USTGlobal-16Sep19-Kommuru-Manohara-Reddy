package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.Product;

public class DeleteDemo {
	public static void main(String[] args) {
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 102);
			entityManager.remove(product);
			System.out.println("Deleted Record successfully");
			entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}