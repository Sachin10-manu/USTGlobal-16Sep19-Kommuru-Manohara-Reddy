package com.ustglobal.retailermaintenanceproject.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;


@Entity
@Table(name = "product")
public class ProductBean {
	
	@Id
	@Column
	private int orderId;
	@Column
	private String productName;
	@Column
	private int price;
	@Column
	private int quantity;
	@Column
	private int amountPay;
	
	@Exclude
	@OneToOne(mappedBy = "productbean")
	private RetailerBean retailerbean;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmountPay() {
		return amountPay;
	}
	public void setAmountPay(int amountPay) {
		this.amountPay = amountPay;
	}
	public RetailerBean getRetailerbean() {
		return retailerbean;
	}
	public void setRetailerbean(RetailerBean retailerbean) {
		this.retailerbean = retailerbean;
	}
	
}
