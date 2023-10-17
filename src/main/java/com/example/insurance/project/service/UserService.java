package com.example.insurance.project.service;

import java.util.List;

import com.example.insurance.project.model.User;

public interface UserService {
	public User saveUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(Integer userId);
	
	public User getUserById(Integer userId);
	
	public List<User> getAllUsers ();

}
