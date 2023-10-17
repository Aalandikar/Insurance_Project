package com.example.insurance.project.service;

import java.util.List;

import com.example.insurance.project.model.Premium;

public interface PremiumService {
	
	public List<Premium> getAllPremiums();
	 public Premium getPremiumById(Integer premiumId) ;
	 public Premium savePremium(Premium premium);
	 public Premium updatePremium(Premium premium);
	 public String deletePremium(Integer premiumId);

}
