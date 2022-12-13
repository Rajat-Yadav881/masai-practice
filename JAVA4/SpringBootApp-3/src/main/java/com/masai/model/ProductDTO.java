package com.masai.model;



public class ProductDTO {

	private String productName;
	
	private int quantity;
	
	private double price;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ProductDTO(String productName, int quantity, double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
