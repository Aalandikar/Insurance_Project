package com.example.insurance.project.service;

import java.util.List;

import com.example.insurance.project.model.Policy;

public interface PolicyService {
	public Policy savePolicy(Policy policy);
	
public Policy updatePolicy(Policy policy);
	
	public void deletePolicy(Integer policyId);
	
	public Policy getPolicyById(Integer policyId);
	
	public List<Policy> getAllPolicies ();

}
