package com.model;

public class Clothing extends Product {
  private int clothingId;
  private String size;
  private String colour;
  private int productId;
public Clothing(int clothingId, String size, String colour, int productId) {
	super();
	this.clothingId = clothingId;
	this.size = size;
	this.colour = colour;
	this.productId = productId;
}
public Clothing() {
	super();
	// TODO Auto-generated constructor stub
}
public Clothing(int product_id, String product_name, String description, double price, int stock_quantity,
		String type) {
	super(product_id, product_name, description, price, stock_quantity, type);
	// TODO Auto-generated constructor stub
}
public int getClothingId() {
	return clothingId;
}
public void setClothingId(int clothingId) {
	this.clothingId = clothingId;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
@Override
public String toString() {
	return "Clothing [clothingId=" + clothingId + ", size=" + size + ", colour=" + colour + ", productId=" + productId
			+ "]";
}
  
}
