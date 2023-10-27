package com.example.insurance.project.service;

import java.util.List;

import com.example.insurance.project.model.Coverage;


public interface CoverageService {
	
public Coverage saveCoverage(Coverage coverage);
	
	public Coverage updateCoverage(Coverage coverage);
	
	public void deleteCoverage(Integer coverageId);

	public Coverage getCoverageById(Integer coverageId);

	public List<Coverage> getAllCoverages();

}
