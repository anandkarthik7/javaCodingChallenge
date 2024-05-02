package com.model;

public class Electronics extends Product  {
	private int electronicsId;
      private  String brand;
      private  int warranty_period;
      private int product_id;
	public Electronics(int electronicsId, String brand, int warranty_period, int product_id) {
		super();
		this.electronicsId = electronicsId;
		this.brand = brand;
		this.warranty_period = warranty_period;
		this.product_id = product_id;
	}
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int product_id, String product_name, String description, double price, int stock_quantity,
			String type) {
		super(product_id, product_name, description, price, stock_quantity, type);
		// TODO Auto-generated constructor stub
	}
	public int getElectronicsId() {
		return electronicsId;
	}
	public void setElectronicsId(int electronicsId) {
		this.electronicsId = electronicsId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWarranty_period() {
		return warranty_period;
	}
	public void setWarranty_period(int warranty_period) {
		this.warranty_period = warranty_period;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	@Override
	public String toString() {
		return "Electronics [electronicsId=" + electronicsId + ", brand=" + brand + ", warranty_period="
				+ warranty_period + ", product_id=" + product_id + "]";
	}
	
}