package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.UserNotFoundException;
import com.model.User;

public interface UserDao {

	boolean userexits(int userId)throws SQLException,UserNotFoundException;

	int save(User user)throws SQLException;

	List<User> findAll()throws SQLException;

	

}
