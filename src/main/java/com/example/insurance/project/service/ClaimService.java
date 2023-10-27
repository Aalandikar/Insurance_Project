package com.example.insurance.project.service;

import java.util.List;

import com.example.insurance.project.model.Claim;

public interface ClaimService {
	public Claim saveClaim(Claim claim);
	
	public Claim updateClaim(Claim claim);
	
	public void deleteClaim(Integer claimId);

	public Claim getClaimById(Integer claimId);

	public List<Claim> getAllClaims();
	
}
