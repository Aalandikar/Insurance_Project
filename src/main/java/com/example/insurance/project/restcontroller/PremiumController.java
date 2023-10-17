package com.example.insurance.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.insurance.project.model.Premium;
import com.example.insurance.project.service.PremiumService;

public class PremiumController {
	
	@Autowired
 private PremiumService premiumService;
	
	@PostMapping("insurance/savePremium")
	public Premium savePremium(@RequestBody Premium premium) {
		Premium premium1=premiumService.savePremium(premium);
		return premium1;
	}
	
	@PutMapping("insurance/updatePremium")
	public Premium updatePremium(@RequestBody Premium premium) {
		Premium premium1 = premiumService.updatePremium(premium);
		return premium1;
	}

	@GetMapping("insurance/getPremiumsList")
	public List<Premium> getPremiumList() {
		List<Premium> premiums = premiumService.getAllPremiums();
		return premiums;

	}

	@GetMapping("insurance/getPremiumById/{premiumId}")
	public Premium getTransactionById(@PathVariable("premiumId") Integer premiumId) {
		Premium premium = premiumService.getPremiumById(premiumId);
			return premium;

	}

	@DeleteMapping("insurance/DeletePremiumById{premiumId}")
	public String DeletePremiumById(@PathVariable("premiumId") Integer premiumId) {
		premiumService.deletePremium(premiumId);
		return "Deleted successfully!!";

	}

}
