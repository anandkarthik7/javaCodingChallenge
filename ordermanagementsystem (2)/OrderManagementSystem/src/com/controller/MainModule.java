package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dto.GetOrderbyUser;
import com.exception.ResourceNotFoundException;
import com.exception.UserNotFoundException;
import com.model.Clothing;
import com.model.Electronics;
import com.model.Order;
import com.model.Product;
import com.model.User;
import com.service.OrderService;
import com.service.ProductService;
import com.service.UserService;

public class MainModule {
public static void main(String[] args) throws ResourceNotFoundException, UserNotFoundException {
	ProductService productService=new ProductService();
	OrderService orderService=new OrderService();
	UserService userService=new UserService();
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		System.out.println("---------- OrderManagementSystem-------------");
		System.out.println("Press 1. FindAll Products ");
		System.out.println("Press 2. Create order");
		System.out.println("press 3. Cancel order");
		System.out.println("press 4: Create product");
		System.out.println("press 5: Create user");
		System.out.println("press 6: Getorderbyuser");
		System.out.println("press 0: Exit");
		int input=sc.nextInt();
		if(input==0) {
			System.out.println("Exiting Order Module..");
			break;
		}
		switch(input) {
		case 1:
			try {
				
;				List<Product> list=productService.findAll();
				for(Product a :list) {
					System.out.println(a);
					
				}
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}catch(ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
		case 2:
			try {
			Order order=new Order();
			Random random =new Random();
			int randomNumber = random.nextInt();
			int order_id=randomNumber<0?randomNumber*-1:randomNumber;
			System.out.println("order_id:" +order_id);
			order.setOrder_id(order_id);
			
			List<User>list1=userService.findAll();
			for(User a:list1) {
				System.out.println(a);
			}
			
			System.out.println("Enter user_id");
			int user_id=sc.nextInt();
		    userService.isUserIdPresent(user_id);
		    order.setUser_id(user_id);
		    
		    
		    List<Product>list2=productService.findAll();
		    for(Product p:list2) {
		    	System.out.println(p);
		    }
		    System.out.println("enter product_id");
			int product_id=sc.nextInt();
			order.setProductId(product_id);
		    productService.findproductid(product_id);
		    
		    
		    System.out.println("enter quantity");
		    int quantity=sc.nextInt();
		    order.setQuantity(quantity);
		   
		    
		   // Order order=new Order(order_id,user_id,product_id,quantity);
		    int status=orderService.insert(order);
		    if(status==1)
		    	System.out.println("order record added to DB");
		    else
		    	System.out.println("Insert operation failed");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			
		}catch(UserNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(ResourceNotFoundException e) {
			System.out.println(e.getMessage());
		}
		    
		    
			break; 
		case 3:
			try {
			List<User>list1=userService.findAll();
				for(User a:list1) {
					System.out.println(a);
				}
		    System.out.println("Enter user id");
		    int user_id=sc.nextInt();
		    
			List<Order> list=orderService.findorders(user_id);
			for(Order a :list) {
				System.out.println(a);
				
			}
			
			System.out.println("enter order id");
			int order_id=sc.nextInt();
			
			orderService.findorderid(order_id);
			
			
				orderService.softDeleteByid(order_id);
				System.out.println("order record de-activated");
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}catch(ResourceNotFoundException e) {
				System.out.println(e.getMessage());
			
			}catch(UserNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			try {
				Random random =new Random();
				int randomNumber = random.nextInt();
				int product_id=randomNumber<0?randomNumber*-1:randomNumber;
				System.out.println("product_id:" +product_id);
				
				System.out.println("enter product name:");
				sc.nextLine();
				String productname=sc.nextLine();
				
				System.out.println("enter description");
				String description=sc.nextLine();
			
				System.out.println("enter price");
				double price=sc.nextDouble();
				System.out.println("enter quantity in stock");
				int quantity=sc.nextInt();
				sc.nextLine();
				System.out.println("enter type");
				String type=sc.nextLine();
				
			   if(type.equals("electronics")) {
				   Random random1 =new Random();
					int randomNumber1 = random1.nextInt();
					int electronics_id=randomNumber1<0?randomNumber1*-1:randomNumber1;
					System.out.println("Electronics_id" +electronics_id);
					
					System.out.println("Enter the name of the Brand");
					String brand=sc.nextLine();
					
					System.out.println("Enter ther warranty period");
					int warranty_period=sc.nextInt();
					
					 Product product=new Product(product_id,productname,description,price,quantity,type);
					 
					 productService.insert(product);
					 Electronics electronics=new Electronics(electronics_id,brand,warranty_period,product_id);
					 int status=productService.insertelectronics(electronics);
					 if(status==1) {
							System.out.println("product record added to DB");
						}
						else {
							System.out.println("Insertion failed");
						}
					 
			   }
			   else if(type.equals("clothing")) {
				   Random random1 =new Random();
					int randomNumber1 = random1.nextInt();
					int clothing_id=randomNumber1<0?randomNumber1*-1:randomNumber1;
					System.out.println("clothing_id" +clothing_id);
					
					System.out.println("Enter the sixe of the product");
					String size=sc.nextLine();
					
					System.out.println("Enter the colour of the product");
					String colour=sc.nextLine();
					Product product=new Product(product_id,productname,description,price,quantity,type);
					productService.insert(product);
					Clothing clothing=new Clothing(clothing_id,size,colour,product_id);
					int status=productService.insertClothing(clothing);
					if(status==1) {
						System.out.println("product record added to DB");
					}
					else {
						System.out.println("Insertion failed");
					}
			   }
			   else {
				   System.out.println("Enter correct product type");
			   }
			    
			    
			    
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				
			}
			break;
		case 5:
			try {
				Random random =new Random();
				int randomNumber = random.nextInt();
				int user_id=randomNumber<0?randomNumber*-1:randomNumber;
				System.out.println("userid:" +user_id);
				
				System.out.println("enter user name:");
				sc.nextLine();
				String username=sc.nextLine();
				
				System.out.println("enter password");
				String password=sc.nextLine();
			
				System.out.println("enter role");
				String role=sc.nextLine();
				
				
			    User user=new User(user_id,username,password,role);
			    int status=userService.insert(user);
			    if(status==1)
			    	System.out.println("User record added to DB");
			    else
			    	System.out.println("Insert operation failed");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				
			}
			break;
		case 6:
			try {
				List<User>list1=userService.findAll();
				for(User a:list1) {
					System.out.println(a);
				}
				
				System.out.println("enter user id");
				int user_id=sc.nextInt();
				userService.isUserIdPresent(user_id);
			
				List<GetOrderbyUser> list=orderService.findorderbyuser(user_id);
				for(GetOrderbyUser a :list) {
					System.out.println(a);
					
				}
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}catch(UserNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			}
				
		}

sc.close();
}
}