package com.example.insurance.project.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.insurance.project.model.Policy;
import com.example.insurance.project.service.PolicyService;

@RestController
public class InsuranceController {
	@Autowired
 private PolicyService policyService;
	
	@PostMapping("insurance/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		Policy policy1=policyService.savePolicy(policy);
		return policy1;
	}

}
