package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		
//		EntityManager entityManager = null;
//		EntityTransaction transaction = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product product = entityManager.getReference(Product.class, 101);
		System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getQuantity());
		entityManager.close();
	}
}
