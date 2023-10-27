package com.example.insurance.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.Claim;
import com.example.insurance.project.repository.ClaimRepository;
import com.example.insurance.project.service.ClaimService;


@Service
public class ClaimServiceImpl implements ClaimService {

	// Inject repository reference
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public Claim saveClaim(Claim claim) {
		Claim claims1= claimRepository.save(claim);
		return claims1;
	}

	@Override
	public Claim updateClaim(Claim claim) {
		Claim claims1= claimRepository.save(claim);
		return claims1;
	}


	@Override
	public void deleteClaim(Integer claimId) {
		claimRepository.deleteById(claimId);
		
	}

	@Override
	public Claim getClaimById(Integer claimId) {
		Claim claims1= claimRepository.getById(claimId);
		return claims1;
	}

	@Override
	public List<Claim> getAllClaims() {
		List<Claim> claims = claimRepository.findAll();
		return claims;
	}

}
