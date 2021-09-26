package com.src.dao;

import java.util.List;

import com.src.model.User;

public interface UserDAOInterface {
	
	public int addUser(User u);
	public int updateUser(User u);
	public int deleteUser(User u);
	public List<User> displayAllUsers();
	
}
