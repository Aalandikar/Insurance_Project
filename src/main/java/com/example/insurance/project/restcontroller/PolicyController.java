package com.example.insurance.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.insurance.project.exception.InsuranceExceptionHandling;
import com.example.insurance.project.model.Policy;



import com.example.insurance.project.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
 private PolicyService policyService;
	
	@PostMapping("insurance/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		Policy policy1=policyService.savePolicy(policy);
		return policy1;
	}
	@PutMapping("insurance/updatePolicy")
	public Policy updatePolicy(@RequestBody Policy policy) {
		Policy policy1=policyService.savePolicy(policy);
		return policy1;
	}

	@GetMapping("insurance/getPolicyList")
	public List<Policy> getUserList() {
		List<Policy> policies = policyService.getAllPolicies();
		return policies;
	}

	@GetMapping("insurance/getPolicyById/{policyId}")
	public Policy getPolicyById(@PathVariable("policyId") Integer policyId) throws RuntimeException {
		Policy policy = policyService.getPolicyById(policyId);
		if(policy == null)
			throw new InsuranceExceptionHandling("Policy not found!!");
		else
		return policy;
	}

	@DeleteMapping("insurance/DeletePolicyById/{policyId}")
	public String DeletePolicyrById(@PathVariable("policyd") Integer policyId) {
		policyService.deletePolicy(policyId);
		return "Deleted successfully!!";
	}
}
