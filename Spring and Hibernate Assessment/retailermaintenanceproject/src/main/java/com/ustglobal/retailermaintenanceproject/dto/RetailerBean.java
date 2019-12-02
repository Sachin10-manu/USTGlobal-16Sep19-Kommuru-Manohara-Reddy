package com.ustglobal.retailermaintenanceproject.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "retailer")
public class RetailerBean {

	@Id
	@Column
	@GeneratedValue
	private int rId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="orderId")
	private ProductBean productbean;
	public ProductBean getProductbean() {
		return productbean;
	}
	public void setProductbean(ProductBean productbean) {
		this.productbean = productbean;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rid) {
		this.rId = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
