package com.example.insurance.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.insurance.project.exception.InsuranceExceptionHandling;
import com.example.insurance.project.model.Policy;
import com.example.insurance.project.model.User;
import com.example.insurance.project.service.UserService;

@RestController
public class UserController {
	@Autowired
 private UserService userService;
	
	@PostMapping("insurance/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1=userService.saveUser(user);
		return user1;
	}
	
	@PutMapping("insurance/updateUser")
	public User updateUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
	}

	@GetMapping("insurance/getUsersList")
	public List<User> getUserList() {
		List<User> users = userService.getAllUsers();
		return users;

	}

	@GetMapping("insurance/getUserById/{userId}")
	public User getUserById(@PathVariable("userId") Integer userId) throws Exception {
		User user = userService.getUserById(userId);
		if(user == null)
			throw new InsuranceExceptionHandling("User not found!!");
		else
		return user;

	}

	@DeleteMapping("insurance/DeleteUserById/{userId}")
	public String DeleteUserById(@PathVariable("userId") Integer userId) {
		userService.deleteUser(userId);
		return "Deleted successfully!!";

	}

	@GetMapping("insurance/updatePassword/{userId}")
	public Boolean updatePassword(@PathVariable("userId") Integer userId, @RequestParam("password") String password)
			throws Exception {
		User user = userService.getUserById(userId);
		if (user != null) {
			user.setPassword(password);
			userService.saveUser(user);
			return true;
		}
		return false;

	}

}
