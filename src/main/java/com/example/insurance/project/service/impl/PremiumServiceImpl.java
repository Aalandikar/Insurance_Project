package com.example.insurance.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.Premium;
import com.example.insurance.project.repository.PremiumRepository;
import com.example.insurance.project.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {
	@Autowired
	 private PremiumRepository premiumRepository;

	    public List<Premium> getAllPremiums() {
	        return premiumRepository.findAll();
	    }

	    public Premium getPremiumById(Integer premiumId) {
	        return premiumRepository.getById(premiumId);
	    }

	    public Premium savePremium(Premium premium) {
	        return premiumRepository.save(premium);
	    }

	    public String deletePremium(Integer premiumId) {
	        premiumRepository.deleteById(premiumId);
	        return "Deleted Successfully!";
	    }

		@Override
		public Premium updatePremium(Premium premium) {
			return premiumRepository.save(premium);
		}

}
