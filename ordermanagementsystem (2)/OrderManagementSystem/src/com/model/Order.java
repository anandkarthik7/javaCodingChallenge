package com.model;

public class Order {
	private int order_id;
    private int user_id;
    private int quantity;
    private int productId;
	public Order(int order_id, int user_id, int quantity, int productId) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.quantity = quantity;
		this.productId = productId;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user_id=" + user_id + ", quantity=" + quantity + ", product_id="
				+ productId + "]";
	}
	

}
