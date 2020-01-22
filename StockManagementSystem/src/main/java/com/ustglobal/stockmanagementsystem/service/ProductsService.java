package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import com.ustglobal.stockmanagementsystem.dto.ProductsInfo;

public interface ProductsService {
	
	public boolean addProduct(ProductsInfo products);
	public boolean updateProduct(ProductsInfo products);
	public ProductsInfo getProductByName(String name);
	public List<ProductsInfo> getProductByCategory(String category);
	public List<ProductsInfo> getAllProducts();
	public boolean deleteProductById(int id);
}