package com.servlet.service;

import com.servlet.dao.UserDao;
import com.servlet.entity.User;
public class UserService {
	UserDao userDao = new UserDao();

	public String saveUser(User user) {
		return userDao.saveUser(user);
	}
	
public boolean loginUser(String name,String password) {
	return userDao.loginUser(name,password);
	
	

			
		
	}
	
}
