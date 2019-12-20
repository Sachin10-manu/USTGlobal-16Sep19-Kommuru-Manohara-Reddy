package com.ustglobal.stockmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.stockmanagementsystem.dto.ProductResponse;
import com.ustglobal.stockmanagementsystem.dto.ProductsInfo;
import com.ustglobal.stockmanagementsystem.service.ProductsService;
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RestController
public class ProductsController {
	
	@Autowired
	private ProductsService service;
	
	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductsInfo products) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(products)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added to DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to DB");
		}
		return response;
	}
	
	@PutMapping(path = "/update",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody ProductsInfo products) {
		ProductResponse response = new ProductResponse();
		if(service.updateProduct(products)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data modified to DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified to DB");
		}
		return response;
	}
	
	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProducts(){
		ProductResponse response = new ProductResponse();
		List<ProductsInfo> products = service.getAllProducts();
		if(!products.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			response.setPinfo(products);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");
		}
		return response;
	}
	
	@DeleteMapping(path = "/delete/{id}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("id")int id) {
		ProductResponse response = new ProductResponse();
		if(service.deleteProductById(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data deleted from DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted from DB");
		}
		return response;
	}
	
	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@RequestParam("name")String name) {
		ProductResponse response = new ProductResponse();
		ProductsInfo products = service.getProductByName(name);
		if(products!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			List<ProductsInfo> pinfo = null;
			response.setPinfo(pinfo);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");
		}
		return response;
	}
}
