package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.ResourceNotFoundException;
import com.model.Clothing;
import com.model.Electronics;
import com.model.Product;

public interface ProductDao {

	

	List<Product> findAll()throws SQLException,ResourceNotFoundException;

	int save(Product product)throws SQLException;

	boolean findproduct(int product_id)throws SQLException,ResourceNotFoundException;

	int  saveelectronics(Electronics electronics)throws SQLException;

	int saveclothing(Clothing clothing)throws SQLException;

	

	

}
