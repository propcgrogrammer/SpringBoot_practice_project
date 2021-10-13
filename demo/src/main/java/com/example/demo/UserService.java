package com.example.demo;

import java.util.List;


public interface UserService {
	
	User addUser(User user);
	
	User getUser(String username);
	
	List<User> getUsers();
	
	User updateUser(User user);
	
	void deleteUser(User user);

}
