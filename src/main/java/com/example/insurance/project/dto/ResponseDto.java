package com.example.insurance.project.dto;

import com.example.insurance.project.model.User;

public class ResponseDto {

	private User user;
	private PolicyDto policy;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public PolicyDto getPolicy() {
		return policy;
	}
	public void setPolicy(PolicyDto policy) {
		this.policy = policy;
	}
	
}
