package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ProductDao;
import com.daoImpl.ProductDaoImpl;
import com.exception.ResourceNotFoundException;
import com.model.Clothing;
import com.model.Electronics;
import com.model.Order;
import com.model.Product;

public class ProductService {
    ProductDao dao=new ProductDaoImpl();

	public List<Product> findAll() throws SQLException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

	public int insert(Product product)throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(product);
	}

	public boolean findproductid(int product_id) throws SQLException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		boolean isproductid=dao.findproduct(product_id);
		if(!isproductid) {
			throw new ResourceNotFoundException("product id not found");
		}
		return isproductid;
		
	}

	public int insertelectronics(Electronics electronics) throws SQLException {
		// TODO Auto-generated method stub
	 return dao.saveelectronics(electronics);
	}

	public int insertClothing(Clothing clothing) throws SQLException {
		// TODO Auto-generated method stub
		return dao.saveclothing(clothing);
	}

	
	}

	
	
	
	


