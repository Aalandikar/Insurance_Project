package com.example.insurance.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.Policy;
import com.example.insurance.project.repository.PolicyRepository;
import com.example.insurance.project.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService{

	@Autowired
	private PolicyRepository policyRepository;
	
	@Override
	public Policy savePolicy(Policy policy) {
		Policy policy1=policyRepository.save(policy);
		return policy1;
	}

}
