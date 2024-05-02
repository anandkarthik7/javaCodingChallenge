package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.UserDao;
import com.daoImpl.UserDaoImpl;
import com.exception.UserNotFoundException;
import com.model.User;

public class UserService {
UserDao dao=new UserDaoImpl();
public boolean isUserIdPresent(int userId) throws SQLException, UserNotFoundException {
    boolean userexists=dao.userexits(userId);
    if (!userexists) {
        throw new UserNotFoundException("User id not found.");
    }

    return userexists;// Check if user ID exists
}
public void createUser(User user) {
	// TODO Auto-generated method stub
	
}
public int insert(User user) throws SQLException {
	// TODO Auto-generated method stub
	return dao.save(user);
}
public List<User> findAll()throws SQLException{
	// TODO Auto-generated method stub
    
	return dao.findAll();
}

}
