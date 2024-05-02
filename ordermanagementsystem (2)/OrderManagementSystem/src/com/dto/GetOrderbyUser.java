package com.dto;

public class GetOrderbyUser {
        private int order_id;
        private int user_id;
        private String product_name;
        private int price;
        private String type;
        private int product_id;
		public GetOrderbyUser(int order_id, int user_id, String product_name, int price, String type, int product_id) {
			super();
			this.order_id = order_id;
			this.user_id = user_id;
			this.product_name = product_name;
			this.price = price;
			this.type = type;
			this.product_id = product_id;
		}
		public GetOrderbyUser() {
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
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getProduct_id() {
			return product_id;
		}
		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}
		@Override
		public String toString() {
			return "GetOrderbyUser [order_id=" + order_id + ", user_id=" + user_id + ", product_name=" + product_name
					+ ", price=" + price + ", type=" + type + ", product_id=" + product_id + "]";
		}
		
}
