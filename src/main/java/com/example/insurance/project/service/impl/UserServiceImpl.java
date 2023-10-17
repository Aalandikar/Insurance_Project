package com.example.insurance.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.exception.InsuranceExceptionHandling;
import com.example.insurance.project.model.User;
import com.example.insurance.project.repository.UserRepository;
import com.example.insurance.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User user1 =userRepository.save(user);
		System.out.println("User saved Successfully");
		return user1;
	}

	@Override
	public User updateUser(User user) {
		User user1 =userRepository.save(user);
		System.out.println("User updated Successfully");
		return user1;
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		System.out.println("User Deleted Successfully");
	}

	@Override
	public User getUserById(Integer userId) {
		User user = userRepository.getById(userId);
		if(user == null)
			throw new InsuranceExceptionHandling("User not found!!");
		else
		return user;
	}
	

	@Override
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}

}
