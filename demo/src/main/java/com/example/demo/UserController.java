package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String hello() {
		return "API : Hello World";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		
		return userService.getUsers();
	}
	
	@GetMapping("/getUser/{userInfo}")
	public User getUser(@PathVariable String userInfo) {
		
		return userService.getUser(userInfo);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestBody User user) {
		
		userService.deleteUser(user);
	}

}
