package com.example.insurance.project.service.impl;

import java.util.List;

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

	@Override
	public Policy updatePolicy(Policy policy) {
		Policy policy1=policyRepository.save(policy);
		return policy1;
	}

	@Override
	public void deletePolicy(Integer policyId) {
	policyRepository.deleteById(policyId);
	}

	@Override
	public Policy getPolicyById(Integer policyId) {
		Policy policy1=policyRepository.getById(policyId);
		return policy1;
	}

	@Override
	public List<Policy> getAllPolicies() {
		List<Policy> policies=policyRepository.findAll();
		return policies;
	}

}
