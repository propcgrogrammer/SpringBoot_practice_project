package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo ;
	
	@Override
	public User addUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User getUser(String userName) {
		
		return userRepo.findByUserName(userName);
	}

	@Override
	public List<User> getUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		
		userRepo.delete(user);
	}
	
	

}
