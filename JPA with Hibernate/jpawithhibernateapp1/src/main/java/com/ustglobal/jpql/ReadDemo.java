package com.ustglobal.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp1.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		
		List<String> p = query.getResultList();
		
		for(String pname : p) {
//			System.out.println("Id: "+s.getPid());
			System.out.println(pname);
//			System.out.println("Quantity: "+s.getQuantity());
		}
	}
}
