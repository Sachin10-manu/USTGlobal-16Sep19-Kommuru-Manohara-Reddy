package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagementsystem.dao.ProductsDao;
import com.ustglobal.stockmanagementsystem.dto.ProductsInfo;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	private ProductsDao dao;
	@Override
	public boolean addProduct(ProductsInfo products) {
		return dao.addProduct(products);
	}

	@Override
	public boolean updateProduct(ProductsInfo products) {
		return dao.updateProduct(products);
	}

	@Override
	public ProductsInfo getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<ProductsInfo> getProductByCategory(String category) {
		return dao.getProductByCategory(category);
	}

	@Override
	public List<ProductsInfo> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProductById(int id) {
		return dao.deleteProductById(id);
	}

}
