package com.example.insurance.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.Nominee;
import com.example.insurance.project.repository.NomineeRepository;
import com.example.insurance.project.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService {

	@Autowired
	private NomineeRepository nomineeRepository;
	
	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nominee1= nomineeRepository.save(nominee);
		return nominee1;
	}

	@Override
	public Nominee updateNominee(Nominee nominee) {
		Nominee nominee1= nomineeRepository.save(nominee);
		return nominee1;
	}

	@Override
	public void deleteNominee(Integer nomineeId) {
		nomineeRepository.deleteById(nomineeId);	
	}

	@Override
	public Nominee getNomineeById(Integer nomineeId) {
		Nominee nominee1= nomineeRepository.getById(nomineeId);
		return nominee1;
	}

	@Override
	public List<Nominee> getAllNominees() {
		List<Nominee> nominees = nomineeRepository.findAll();
		return nominees;
	}

}
