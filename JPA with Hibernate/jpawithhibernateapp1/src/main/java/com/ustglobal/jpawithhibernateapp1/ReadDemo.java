package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.Product;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product product = entityManager.find(Product.class, 101);
		System.out.println("Id: "+product.getPid());
		System.out.println("Name: "+product.getPname());
		System.out.println("Quantity: "+product.getQuantity());
	}
}
