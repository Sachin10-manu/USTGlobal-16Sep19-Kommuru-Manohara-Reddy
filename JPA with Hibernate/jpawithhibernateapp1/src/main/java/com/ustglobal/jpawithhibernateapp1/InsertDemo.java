package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product product = new Product();
		product.setPid(105);
		product.setPname("Pen");
		product.setQuantity(20);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entityManager.getTransaction();
		entitytransaction.begin();
		entityManager.persist(product);
		System.out.println("Record saved");
		entitytransaction.commit();
		entityManager.close();
	}
}