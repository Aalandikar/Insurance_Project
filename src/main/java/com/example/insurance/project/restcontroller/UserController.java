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
import com.example.insurance.project.model.Claim;
import com.example.insurance.project.model.Coverage;
import com.example.insurance.project.model.Nominee;
import com.example.insurance.project.model.PaymentMode;
import com.example.insurance.project.model.Policy;
import com.example.insurance.project.model.Premium;
import com.example.insurance.project.model.User;
import com.example.insurance.project.service.ClaimService;
import com.example.insurance.project.service.CoverageService;
import com.example.insurance.project.service.NomineeService;
import com.example.insurance.project.service.PaymentModeService;
import com.example.insurance.project.service.PolicyService;
import com.example.insurance.project.service.PremiumService;
import com.example.insurance.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private NomineeService nomineeService;

	@Autowired
	private PolicyService policyService;

	@Autowired
	private ClaimService claimService;
	@Autowired
	private CoverageService coverageService;

	@Autowired
	private PremiumService premiumService;

	@Autowired
	private PaymentModeService paymentModeService;

	@PostMapping("insurance/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
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
		if (user == null)
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

	@PostMapping("insurance/saveUserdetails")
	public User saveUserdetails(@RequestBody User user) {
		// call method
		userService.saveUser(user);
		
		List<Policy> policies = user.getPolicyList();
		for (Policy policy : policies) {
			policy.setUserId(user.getUserId()); 
			policyService.savePolicy(policy);
		}
		List<Claim> claims = user.getClaimsList();
		for (Claim claim : claims) {
			claim.setUserId(user.getUserId()); 
			claimService.saveClaim(claim);
		}
		
		List<Premium> premiums = user.getPremiumList();
		for (Premium premium : premiums) {
			premium.setUserId(user.getUserId()); 
			premiumService.savePremium(premium);
		}
		List<PaymentMode> paymentModes = user.getPaymentModeList();
		for (PaymentMode paymentMode : paymentModes) {
			paymentMode.setUserId(user.getUserId()); // 1
			paymentModeService.savePaymentMode(paymentMode);
		}

		List<Nominee> nominee = user.getNomineeList();
		for (Nominee nominees : nominee) {
			nominees.setUserId(user.getUserId()); 
			nomineeService.saveNominee(nominees);
		}
		List<Coverage> coverage = user.getCoverageList();
		for (Coverage coverages : coverage) {
			coverages.setUserId(user.getUserId()); 
			coverageService.saveCoverage(coverages);
		}
		return user; // as response
	}
}
