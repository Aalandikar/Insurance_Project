package com.example.insurance.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.Coverage;
import com.example.insurance.project.repository.CoverageRepository;
import com.example.insurance.project.service.CoverageService;

@Service
public class CoverageServiceImpl implements CoverageService {
	
	@Autowired
	private CoverageRepository coverageRepository;

	@Override
	public Coverage saveCoverage(Coverage coverage) {
		Coverage coverage1= coverageRepository.save(coverage);
		return coverage1;
	}

	@Override
	public Coverage updateCoverage(Coverage coverage) {
		Coverage coverage1= coverageRepository.save(coverage);
		return coverage1;
	}

	@Override
	public void deleteCoverage(Integer coverageId) {
		coverageRepository.deleteById(coverageId);
		
	}

	@Override
	public Coverage getCoverageById(Integer coverageId) {
		Coverage coverage1= coverageRepository.getById(coverageId);
		return coverage1;
	}

	@Override
	public List<Coverage> getAllCoverages() {
		List<Coverage> coverages = coverageRepository.findAll();
		return coverages;
	}

}
