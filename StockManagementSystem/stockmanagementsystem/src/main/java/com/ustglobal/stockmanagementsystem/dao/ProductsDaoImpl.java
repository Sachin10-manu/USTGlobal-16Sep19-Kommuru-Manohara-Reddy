package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.ustglobal.stockmanagementsystem.dto.ProductsInfo;

@Repository
public class ProductsDaoImpl implements ProductsDao{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(ProductsInfo products) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(products);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductsInfo products) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfo p = manager.find(ProductsInfo.class, products.getId());
			p.setCategory(products.getCategory());
			p.setCompany(products.getCompany());
			p.setName(products.getName());
			p.setPrice(products.getPrice());
			p.setQuantity(products.getQuantity());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProductsInfo getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from productsinfo where name=:name";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
			typedQuery.setParameter("name", name);
			ProductsInfo product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsInfo> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from productsinfo where category=:category";
		TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<ProductsInfo> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from productsinfo";
		TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
		return typedQuery.getResultList();
	}

	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfo product = manager.find(ProductsInfo.class, id);
			manager.remove(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
